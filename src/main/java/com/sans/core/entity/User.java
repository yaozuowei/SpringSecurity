package com.sans.core.entity;


import com.sans.common.entity.AbstractDomain;

import java.util.Date;

public class User extends AbstractDomain {
    /**
     * 用户主键
     * 表字段 : t_user.USER_GUID
     */
    private String userGuid;

    /**
     * 用户账号
     * 表字段 : t_user.USER_NO
     */
    private String userNo;

    /**
     * 用户姓名
     * 表字段 : t_user.USER_NAME
     */
    private String userName;

    /**
     * 用户密码
     * 表字段 : t_user.USER_PASSWORD
     */
    private String userPassword;

    /**
     * 是否系统保留用户
     * 表字段 : t_user.USER_SYSTEM
     */
    private String userSystem;

    /**
     * 性别
     * 表字段 : t_user.SEX
     */
    private String sex;

    /**
     * 生日
     * 表字段 : t_user.BIRTHDAY
     */
    private Date birthday;

    /**
     * 电子邮箱
     * 表字段 : t_user.EMAIL
     */
    private String email;

    /**
     * 备注
     * 表字段 : t_user.REMARK
     */
    private String remark;

    /**
     * 手机
     * 表字段 : t_user.DIRECT_TEL
     */
    private String directTel;

    /**
     * 
     * 表字段 : t_user.EXTRA1
     */
    private String extra1;

    /**
     * 
     * 表字段 : t_user.EXTRA2
     */
    private String extra2;

    /**
     * 
     * 表字段 : t_user.EXTRA3
     */
    private String extra3;

    /**
     * 
     * 表字段 : t_user.EXTRA4
     */
    private String extra4;

    /**
     * 
     * 表字段 : t_user.EXTRA5
     */
    private String extra5;

    /**
     * 获取 用户主键 字段:t_user.USER_GUID
     *
     * @return t_user.USER_GUID, 用户主键
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * 设置 用户主键 字段:t_user.USER_GUID
     *
     * @param userGuid the value for t_user.USER_GUID, 用户主键
     */
    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid == null ? null : userGuid.trim();
    }

    /**
     * 获取 用户账号 字段:t_user.USER_NO
     *
     * @return t_user.USER_NO, 用户账号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置 用户账号 字段:t_user.USER_NO
     *
     * @param userNo the value for t_user.USER_NO, 用户账号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * 获取 用户姓名 字段:t_user.USER_NAME
     *
     * @return t_user.USER_NAME, 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户姓名 字段:t_user.USER_NAME
     *
     * @param userName the value for t_user.USER_NAME, 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 用户密码 字段:t_user.USER_PASSWORD
     *
     * @return t_user.USER_PASSWORD, 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置 用户密码 字段:t_user.USER_PASSWORD
     *
     * @param userPassword the value for t_user.USER_PASSWORD, 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 获取 是否系统保留用户 字段:t_user.USER_SYSTEM
     *
     * @return t_user.USER_SYSTEM, 是否系统保留用户
     */
    public String getUserSystem() {
        return userSystem;
    }

    /**
     * 设置 是否系统保留用户 字段:t_user.USER_SYSTEM
     *
     * @param userSystem the value for t_user.USER_SYSTEM, 是否系统保留用户
     */
    public void setUserSystem(String userSystem) {
        this.userSystem = userSystem == null ? null : userSystem.trim();
    }

    /**
     * 获取 性别 字段:t_user.SEX
     *
     * @return t_user.SEX, 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置 性别 字段:t_user.SEX
     *
     * @param sex the value for t_user.SEX, 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取 生日 字段:t_user.BIRTHDAY
     *
     * @return t_user.BIRTHDAY, 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置 生日 字段:t_user.BIRTHDAY
     *
     * @param birthday the value for t_user.BIRTHDAY, 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取 电子邮箱 字段:t_user.EMAIL
     *
     * @return t_user.EMAIL, 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 电子邮箱 字段:t_user.EMAIL
     *
     * @param email the value for t_user.EMAIL, 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 备注 字段:t_user.REMARK
     *
     * @return t_user.REMARK, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:t_user.REMARK
     *
     * @param remark the value for t_user.REMARK, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 手机 字段:t_user.DIRECT_TEL
     *
     * @return t_user.DIRECT_TEL, 手机
     */
    public String getDirectTel() {
        return directTel;
    }

    /**
     * 设置 手机 字段:t_user.DIRECT_TEL
     *
     * @param directTel the value for t_user.DIRECT_TEL, 手机
     */
    public void setDirectTel(String directTel) {
        this.directTel = directTel == null ? null : directTel.trim();
    }

    /**
     * 获取  字段:t_user.EXTRA1
     *
     * @return t_user.EXTRA1, 
     */
    public String getExtra1() {
        return extra1;
    }

    /**
     * 设置  字段:t_user.EXTRA1
     *
     * @param extra1 the value for t_user.EXTRA1, 
     */
    public void setExtra1(String extra1) {
        this.extra1 = extra1 == null ? null : extra1.trim();
    }

    /**
     * 获取  字段:t_user.EXTRA2
     *
     * @return t_user.EXTRA2, 
     */
    public String getExtra2() {
        return extra2;
    }

    /**
     * 设置  字段:t_user.EXTRA2
     *
     * @param extra2 the value for t_user.EXTRA2, 
     */
    public void setExtra2(String extra2) {
        this.extra2 = extra2 == null ? null : extra2.trim();
    }

    /**
     * 获取  字段:t_user.EXTRA3
     *
     * @return t_user.EXTRA3, 
     */
    public String getExtra3() {
        return extra3;
    }

    /**
     * 设置  字段:t_user.EXTRA3
     *
     * @param extra3 the value for t_user.EXTRA3, 
     */
    public void setExtra3(String extra3) {
        this.extra3 = extra3 == null ? null : extra3.trim();
    }

    /**
     * 获取  字段:t_user.EXTRA4
     *
     * @return t_user.EXTRA4, 
     */
    public String getExtra4() {
        return extra4;
    }

    /**
     * 设置  字段:t_user.EXTRA4
     *
     * @param extra4 the value for t_user.EXTRA4, 
     */
    public void setExtra4(String extra4) {
        this.extra4 = extra4 == null ? null : extra4.trim();
    }

    /**
     * 获取  字段:t_user.EXTRA5
     *
     * @return t_user.EXTRA5, 
     */
    public String getExtra5() {
        return extra5;
    }

    /**
     * 设置  字段:t_user.EXTRA5
     *
     * @param extra5 the value for t_user.EXTRA5, 
     */
    public void setExtra5(String extra5) {
        this.extra5 = extra5 == null ? null : extra5.trim();
    }
}