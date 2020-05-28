package com.sans.core.mapper;


import com.sans.core.entity.User;
import com.sans.core.entity.UserExample;

import java.util.List;


public interface UserMapper {
    /**
     *  根据主键删除数据库的记录,t_user
     *
     * @param userGuid
     */
    int deleteByPrimaryKey(String userGuid);

    /**
     *  新写入数据库记录,t_user
     *
     * @param record
     */
    int insert(User record);

    /**
     *  动态字段,写入数据库记录,t_user
     *
     * @param record
     */
    int insertSelective(User record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,t_user
     *
     * @param example
     */
    List<User> selectByExample(UserExample example);

    /**
     *  根据指定主键获取一条数据库记录,t_user
     *
     * @param userGuid
     */
    User selectByPrimaryKey(String userGuid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,t_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *  根据主键来更新符合条件的数据库记录,t_user
     *
     * @param record
     */
    int updateByPrimaryKey(User record);
}