package com.sans.core.entity;


import com.sans.common.entity.AbstractDomain;

public class RmMap extends AbstractDomain {
    /**
     * 角色菜单主键
     * 表字段 : t_rm_map.RM_MAP
     */
    private String rmMap;

    /**
     * 角色主键
     * 表字段 : t_rm_map.ROLE_GUID
     */
    private String roleGuid;

    /**
     * 菜单主键
     * 表字段 : t_rm_map.MENU_GUID
     */
    private String menuGuid;

    /**
     * 获取 角色菜单主键 字段:t_rm_map.RM_MAP
     *
     * @return t_rm_map.RM_MAP, 角色菜单主键
     */
    public String getRmMap() {
        return rmMap;
    }

    /**
     * 设置 角色菜单主键 字段:t_rm_map.RM_MAP
     *
     * @param rmMap the value for t_rm_map.RM_MAP, 角色菜单主键
     */
    public void setRmMap(String rmMap) {
        this.rmMap = rmMap == null ? null : rmMap.trim();
    }

    /**
     * 获取 角色主键 字段:t_rm_map.ROLE_GUID
     *
     * @return t_rm_map.ROLE_GUID, 角色主键
     */
    public String getRoleGuid() {
        return roleGuid;
    }

    /**
     * 设置 角色主键 字段:t_rm_map.ROLE_GUID
     *
     * @param roleGuid the value for t_rm_map.ROLE_GUID, 角色主键
     */
    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid == null ? null : roleGuid.trim();
    }

    /**
     * 获取 菜单主键 字段:t_rm_map.MENU_GUID
     *
     * @return t_rm_map.MENU_GUID, 菜单主键
     */
    public String getMenuGuid() {
        return menuGuid;
    }

    /**
     * 设置 菜单主键 字段:t_rm_map.MENU_GUID
     *
     * @param menuGuid the value for t_rm_map.MENU_GUID, 菜单主键
     */
    public void setMenuGuid(String menuGuid) {
        this.menuGuid = menuGuid == null ? null : menuGuid.trim();
    }
}