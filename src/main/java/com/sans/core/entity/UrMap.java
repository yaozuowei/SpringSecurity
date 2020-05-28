package com.sans.core.entity;


import com.sans.common.entity.AbstractDomain;

public class UrMap extends AbstractDomain {
    /**
     * 
     * 表字段 : t_ur_map.UR_GUID
     */
    private String urGuid;

    /**
     * 用户主键
     * 表字段 : t_ur_map.USER_GUID
     */
    private String userGuid;

    /**
     * 角色主键
     * 表字段 : t_ur_map.ROLE_GUID
     */
    private String roleGuid;

    /**
     * 获取  字段:t_ur_map.UR_GUID
     *
     * @return t_ur_map.UR_GUID, 
     */
    public String getUrGuid() {
        return urGuid;
    }

    /**
     * 设置  字段:t_ur_map.UR_GUID
     *
     * @param urGuid the value for t_ur_map.UR_GUID, 
     */
    public void setUrGuid(String urGuid) {
        this.urGuid = urGuid == null ? null : urGuid.trim();
    }

    /**
     * 获取 用户主键 字段:t_ur_map.USER_GUID
     *
     * @return t_ur_map.USER_GUID, 用户主键
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * 设置 用户主键 字段:t_ur_map.USER_GUID
     *
     * @param userGuid the value for t_ur_map.USER_GUID, 用户主键
     */
    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid == null ? null : userGuid.trim();
    }

    /**
     * 获取 角色主键 字段:t_ur_map.ROLE_GUID
     *
     * @return t_ur_map.ROLE_GUID, 角色主键
     */
    public String getRoleGuid() {
        return roleGuid;
    }

    /**
     * 设置 角色主键 字段:t_ur_map.ROLE_GUID
     *
     * @param roleGuid the value for t_ur_map.ROLE_GUID, 角色主键
     */
    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid == null ? null : roleGuid.trim();
    }
}