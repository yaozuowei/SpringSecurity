package com.sans.core.entity;


import com.sans.common.entity.AbstractDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AbstractDomain {
    /**
     * 菜单主键
     * 表字段 : t_menu.MENU_GUID
     */
    private String menuGuid;

    /**
     * 菜单名称
     * 表字段 : t_menu.MENU_NAME
     */
    private String menuName;

    /**
     * 父菜单ID
     * 表字段 : t_menu.PARENT_ID
     */
    private String parentId;

    /**
     * 显示顺序
     * 表字段 : t_menu.MENU_ORDER
     */
    private Integer menuOrder;

    /**
     * 请求地址
     * 表字段 : t_menu.URL
     */
    private String url;

    /**
     * 打开方式（menuItem页签 menuBlank新窗口）
     * 表字段 : t_menu.TARGET
     */
    private String target;

    /**
     * 菜单类型（M目录 C菜单 F按钮）
     * 表字段 : t_menu.MENU_TYPE
     */
    private String menuType;

    /**
     * 菜单状态（0显示 1隐藏）
     * 表字段 : t_menu.MENU_STATUS
     */
    private String menuStatus;

    /**
     * 权限标识
     * 表字段 : t_menu.PERMS
     */
    private String perms;

    /**
     * 菜单图标
     * 表字段 : t_menu.ICON
     */
    private String icon;

    /**
     * 备注
     * 表字段 : t_menu.remark
     */
    private String remark;

    /**
     * 获取 菜单主键 字段:t_menu.MENU_GUID
     *
     * @return t_menu.MENU_GUID, 菜单主键
     */
    public String getMenuGuid() {
        return menuGuid;
    }

    /**
     * 设置 菜单主键 字段:t_menu.MENU_GUID
     *
     * @param menuGuid the value for t_menu.MENU_GUID, 菜单主键
     */
    public void setMenuGuid(String menuGuid) {
        this.menuGuid = menuGuid == null ? null : menuGuid.trim();
    }

    /**
     * 获取 菜单名称 字段:t_menu.MENU_NAME
     *
     * @return t_menu.MENU_NAME, 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置 菜单名称 字段:t_menu.MENU_NAME
     *
     * @param menuName the value for t_menu.MENU_NAME, 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取 父菜单ID 字段:t_menu.PARENT_ID
     *
     * @return t_menu.PARENT_ID, 父菜单ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置 父菜单ID 字段:t_menu.PARENT_ID
     *
     * @param parentId the value for t_menu.PARENT_ID, 父菜单ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 显示顺序 字段:t_menu.MENU_ORDER
     *
     * @return t_menu.MENU_ORDER, 显示顺序
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * 设置 显示顺序 字段:t_menu.MENU_ORDER
     *
     * @param menuOrder the value for t_menu.MENU_ORDER, 显示顺序
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 获取 请求地址 字段:t_menu.URL
     *
     * @return t_menu.URL, 请求地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 请求地址 字段:t_menu.URL
     *
     * @param url the value for t_menu.URL, 请求地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取 打开方式（menuItem页签 menuBlank新窗口） 字段:t_menu.TARGET
     *
     * @return t_menu.TARGET, 打开方式（menuItem页签 menuBlank新窗口）
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置 打开方式（menuItem页签 menuBlank新窗口） 字段:t_menu.TARGET
     *
     * @param target the value for t_menu.TARGET, 打开方式（menuItem页签 menuBlank新窗口）
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * 获取 菜单类型（M目录 C菜单 F按钮） 字段:t_menu.MENU_TYPE
     *
     * @return t_menu.MENU_TYPE, 菜单类型（M目录 C菜单 F按钮）
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 设置 菜单类型（M目录 C菜单 F按钮） 字段:t_menu.MENU_TYPE
     *
     * @param menuType the value for t_menu.MENU_TYPE, 菜单类型（M目录 C菜单 F按钮）
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * 获取 菜单状态（0显示 1隐藏） 字段:t_menu.MENU_STATUS
     *
     * @return t_menu.MENU_STATUS, 菜单状态（0显示 1隐藏）
     */
    public String getMenuStatus() {
        return menuStatus;
    }

    /**
     * 设置 菜单状态（0显示 1隐藏） 字段:t_menu.MENU_STATUS
     *
     * @param menuStatus the value for t_menu.MENU_STATUS, 菜单状态（0显示 1隐藏）
     */
    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus == null ? null : menuStatus.trim();
    }

    /**
     * 获取 权限标识 字段:t_menu.PERMS
     *
     * @return t_menu.PERMS, 权限标识
     */
    public String getPerms() {
        return perms;
    }

    /**
     * 设置 权限标识 字段:t_menu.PERMS
     *
     * @param perms the value for t_menu.PERMS, 权限标识
     */
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    /**
     * 获取 菜单图标 字段:t_menu.ICON
     *
     * @return t_menu.ICON, 菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置 菜单图标 字段:t_menu.ICON
     *
     * @param icon the value for t_menu.ICON, 菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取 备注 字段:t_menu.remark
     *
     * @return t_menu.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:t_menu.remark
     *
     * @param remark the value for t_menu.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Getter
    @Setter
    List<Menu> children = new ArrayList();
}