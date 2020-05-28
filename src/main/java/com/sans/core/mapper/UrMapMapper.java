package com.sans.core.mapper;

import com.sans.core.entity.Role;
import com.sans.core.entity.UrMap;
import com.sans.core.entity.UrMapExample;

import java.util.List;

public interface UrMapMapper {
    /**
     *  根据主键删除数据库的记录,t_ur_map
     *
     * @param urGuid
     */
    int deleteByPrimaryKey(String urGuid);

    /**
     *  新写入数据库记录,t_ur_map
     *
     * @param record
     */
    int insert(UrMap record);

    /**
     *  动态字段,写入数据库记录,t_ur_map
     *
     * @param record
     */
    int insertSelective(UrMap record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,t_ur_map
     *
     * @param example
     */
    List<UrMap> selectByExample(UrMapExample example);

    /**
     *  根据指定主键获取一条数据库记录,t_ur_map
     *
     * @param urGuid
     */
    UrMap selectByPrimaryKey(String urGuid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,t_ur_map
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UrMap record);

    /**
     *  根据主键来更新符合条件的数据库记录,t_ur_map
     *
     * @param record
     */
    int updateByPrimaryKey(UrMap record);

    /**
     * 根据用户查询角色
     * @param userGuid
     * @return
     */
    List<Role> findRoleByUser(String userGuid);
}