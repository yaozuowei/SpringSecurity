package com.sans.core.mapper;


import com.sans.core.entity.Role;
import com.sans.core.entity.RoleExample;

import java.util.List;


public interface RoleMapper {
    /**
     *  根据主键删除数据库的记录,t_role
     *
     * @param roleGuid
     */
    int deleteByPrimaryKey(String roleGuid);

    /**
     *  新写入数据库记录,t_role
     *
     * @param record
     */
    int insert(Role record);

    /**
     *  动态字段,写入数据库记录,t_role
     *
     * @param record
     */
    int insertSelective(Role record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,t_role
     *
     * @param example
     */
    List<Role> selectByExample(RoleExample example);

    /**
     *  根据指定主键获取一条数据库记录,t_role
     *
     * @param roleGuid
     */
    Role selectByPrimaryKey(String roleGuid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,t_role
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *  根据主键来更新符合条件的数据库记录,t_role
     *
     * @param record
     */
    int updateByPrimaryKey(Role record);
}