package com.sans.core.mapper;

import com.sans.core.entity.Menu;
import com.sans.core.entity.MenuExample;
import java.util.List;

public interface MenuMapper {
    /**
     *  根据主键删除数据库的记录,t_menu
     *
     * @param menuGuid
     */
    int deleteByPrimaryKey(String menuGuid);

    /**
     *  新写入数据库记录,t_menu
     *
     * @param record
     */
    int insert(Menu record);

    /**
     *  动态字段,写入数据库记录,t_menu
     *
     * @param record
     */
    int insertSelective(Menu record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,t_menu
     *
     * @param example
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     *  根据指定主键获取一条数据库记录,t_menu
     *
     * @param menuGuid
     */
    Menu selectByPrimaryKey(String menuGuid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,t_menu
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     *  根据主键来更新符合条件的数据库记录,t_menu
     *
     * @param record
     */
    int updateByPrimaryKey(Menu record);
}