package com.sans.common.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;

public class BizIdGenerator {
    /**
     * 默认用ip地址最后几个字节标示
     */
    private long workerId;

    /**
     * 此处默认为0
     */
    private long dataCenterId;

    private long sequence = 0L;

    /**
     * 节点ID长度
     */
    private long workerIdBits = 8L;

    /**
     * 序列号长度12位
     */
    private long sequenceBits = 12L;

    /**
     * 机器节点左移12位
     */
    private long workerIdShift = sequenceBits;

    /**
     * 数据中心节点左移17位
     */
    private long dataCenterIdShift = sequenceBits + workerIdBits;

    /**
     * 4095(12位序列号)
     */
    private long sequenceMask = -1L ^ (-1L << sequenceBits);

    private long lastTimestamp = -1L;

    public BizIdGenerator(long dataCenterId, long workerId) {
        this.dataCenterId = dataCenterId;
        if(workerId == 0L){
            this.workerId = 0x000000FF & getLastIP();
        }
    }

    /**
     * 调用该方法，获取序列ID
     * @return
     */
    public synchronized String nextId() {
        long timestamp = currentTime();
        //如果服务器时间有问题(时钟后退) 报错。
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(String.format("时钟向后移动。拒绝在%d毫秒内生成id", lastTimestamp - timestamp));
        }
        //如果上次生成时间和当前时间相同,在同一毫秒内
        if (lastTimestamp == timestamp) {
            //sequence自增，因为sequence只有12bit，所以和sequenceMask相与一下，去掉高位
            sequence = (sequence + 1) & sequenceMask;
            //判断是否溢出,也就是每毫秒内超过4095，当为4096时，与sequenceMask相与，sequence就等于0
            if (sequence == 0) {
                //自旋等待到下一毫秒
                timestamp = nextMillis(lastTimestamp);
            }
        } else {
            //如果和上次生成时间不同,重置sequence，就是下一毫秒开始，sequence计数重新从0开始累加
            sequence = 0L;
        }
        lastTimestamp = timestamp;

        long suffix = (dataCenterId << dataCenterIdShift) | (workerId << workerIdShift) | sequence;

        // 格式化日期
        SimpleDateFormat timePe = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String datePrefix = timePe.format(timestamp);

        return datePrefix + suffix;
    }

    /**
     * 比较当前时间戳和下一个时间戳，如果下一个时间戳等于或小于当前时间戳，则循环获取下个时间戳
     * 该方法主要是避免同一时间获取同一时间戳
     * @param lastTimestamp
     * @return
     */
    protected long nextMillis(long lastTimestamp) {
        long timestamp = currentTime();
        while (timestamp <= lastTimestamp) {
            timestamp = currentTime();
        }
        return timestamp;
    }

    /**
     * 获取系统当前时间戳
     * @return
     */
    protected long currentTime() {
        return System.currentTimeMillis();
    }

    /**
     * 获取当前本地IP
     * @return
     */
    private byte getLastIP(){
        byte lastIp = 0;
        try{
            InetAddress ip = InetAddress.getLocalHost();
            byte[] ipByte = ip.getAddress();
            lastIp = ipByte[ipByte.length - 1];
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return lastIp;
    }

}