package com.sans.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回结果工具类
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:37
 */
@Slf4j
public class ResultUtil {

    /**
     * 私有化构造器
     */
    private ResultUtil(){}

    /**
     * 使用response输出JSON
     * @Author Sans
     * @CreateTime 2019/9/28 11:23
     * @Param  resultMap 数据
     * @Return void
     */
    public static void responseJson(ServletResponse response, Map<String, Object> resultMap){
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            out = response.getWriter();
            out.println(JSON.toJSONString(resultMap));
        } catch (Exception e) {
            log.error("【JSON输出异常】"+e);
        }finally{
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }
    /**
     * 返回成功示例
     * @Author Sans
     * @CreateTime 2019/9/28 11:29
     * @Param  resultMap  返回数据MAP
     * @Return Map<String,Object> 返回数据MAP
     */
    public static Map<String, Object> resultSuccess(Map<String, Object> resultMap){
        resultMap.put("message","操作成功");
        resultMap.put("code", 200);
        return resultMap;
    }
    /**
     * 返回失败示例
     * @Author Sans
     * @CreateTime 2019/9/28 11:31
     * @Param  resultMap  返回数据MAP
     * @Return Map<String,Object> 返回数据MAP
     */
    public static Map<String, Object> resultError(Map<String, Object> resultMap){
        resultMap.put("message","操作失败");
        resultMap.put("code",500);
        return resultMap;
    }
    /**
     * 通用示例
     * @Author Sans
     * @CreateTime 2019/9/28 11:35
     * @Param  code 信息码
     * @Param  msg  信息
     * @Return Map<String,Object> 返回数据MAP
     */
    public static Map<String, Object> resultCode(Integer code,String msg){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("message",msg);
        resultMap.put("code",code);
        return resultMap;
    }

    /**
     * 获取ajax提交后的返回数据
     * @param msg 返回信息
     * @return
     */
    public static String getAjaxReturnJson(String msg,Object obj) {
        Map<String,Object> rtnMSG = new HashMap<String,Object>();
        rtnMSG.put("msg", msg);
        rtnMSG.put("status", 200);
        if(obj!=null) {
            rtnMSG.put("data", obj);
        }
        return JSON.toJSONStringWithDateFormat(rtnMSG, "yyyy-MM-dd HH:mm:ss", SerializerFeature.DisableCircularReferenceDetect);
    }

    /**
     * 获取ajax提交异常后的返回数据
     * @param msg 返回信息
     * @return
     */
    public static String getFailAjaxReturnJson(String msg) {
        Map<String,Object> rtnMSG = new HashMap<String,Object>();
        rtnMSG.put("msg", msg);
        rtnMSG.put("status", 500);
        return JSON.toJSONString(rtnMSG);
    }

}