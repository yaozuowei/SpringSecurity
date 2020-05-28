package com.sans.core.entity;


import com.sans.common.entity.AbstractDomain;

public class Role extends AbstractDomain {
    /**
     * 角色主键
     * 表字段 : t_role.ROLE_GUID
     */
    private String roleGuid;

    /**
     * 角色名称
     * 表字段 : t_role.ROLE_NAME
     */
    private String roleName;

    /**
     * 角色权限字符串
     * 表字段 : t_role.ROLE_KEY
     */
    private String roleKey;

    /**
     * 显示顺序
     * 表字段 : t_role.ROLE_ORDER
     */
    private Integer roleOrder;

    /**
     * 角色状态（0正常 1停用）
     * 表字段 : t_role.ROLE_STATUS
     */
    private Integer roleStatus;

    /**
     * 删除标志（0代表存在 1代表删除）
     * 表字段 : t_role.ROLE_DLE_FLAG
     */
    private Integer roleDleFlag;

    /**
     * 获取 角色主键 字段:t_role.ROLE_GUID
     *
     * @return t_role.ROLE_GUID, 角色主键
     */
    public String getRoleGuid() {
        return roleGuid;
    }

    /**
     * 设置 角色主键 字段:t_role.ROLE_GUID
     *
     * @param roleGuid the value for t_role.ROLE_GUID, 角色主键
     */
    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid == null ? null : roleGuid.trim();
    }

    /**
     * 获取 角色名称 字段:t_role.ROLE_NAME
     *
     * @return t_role.ROLE_NAME, 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置 角色名称 字段:t_role.ROLE_NAME
     *
     * @param roleName the value for t_role.ROLE_NAME, 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取 角色权限字符串 字段:t_role.ROLE_KEY
     *
     * @return t_role.ROLE_KEY, 角色权限字符串
     */
    public String getRoleKey() {
        return roleKey;
    }

    /**
     * 设置 角色权限字符串 字段:t_role.ROLE_KEY
     *
     * @param roleKey the value for t_role.ROLE_KEY, 角色权限字符串
     */
    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey == null ? null : roleKey.trim();
    }

    /**
     * 获取 显示顺序 字段:t_role.ROLE_ORDER
     *
     * @return t_role.ROLE_ORDER, 显示顺序
     */
    public Integer getRoleOrder() {
        return roleOrder;
    }

    /**
     * 设置 显示顺序 字段:t_role.ROLE_ORDER
     *
     * @param roleOrder the value for t_role.ROLE_ORDER, 显示顺序
     */
    public void setRoleOrder(Integer roleOrder) {
        this.roleOrder = roleOrder;
    }

    /**
     * 获取 角色状态（0正常 1停用） 字段:t_role.ROLE_STATUS
     *
     * @return t_role.ROLE_STATUS, 角色状态（0正常 1停用）
     */
    public Integer getRoleStatus() {
        return roleStatus;
    }

    /**
     * 设置 角色状态（0正常 1停用） 字段:t_role.ROLE_STATUS
     *
     * @param roleStatus the value for t_role.ROLE_STATUS, 角色状态（0正常 1停用）
     */
    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * 获取 删除标志（0代表存在 1代表删除） 字段:t_role.ROLE_DLE_FLAG
     *
     * @return t_role.ROLE_DLE_FLAG, 删除标志（0代表存在 1代表删除）
     */
    public Integer getRoleDleFlag() {
        return roleDleFlag;
    }

    /**
     * 设置 删除标志（0代表存在 1代表删除） 字段:t_role.ROLE_DLE_FLAG
     *
     * @param roleDleFlag the value for t_role.ROLE_DLE_FLAG, 删除标志（0代表存在 1代表删除）
     */
    public void setRoleDleFlag(Integer roleDleFlag) {
        this.roleDleFlag = roleDleFlag;
    }
}