package com.sans.core.service;

import com.sans.common.BaseService;
import com.sans.core.entity.User;
import com.sans.core.entity.UserExample;
import com.sans.core.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/26/14:31
 * @Description:
 */
@Service("UserService")
public class UserService extends BaseService {

    @Resource
    UserMapper userMapper;

    /**
     * 根据userLabel查询一条记录
     * @param userLabel
     * @return
     */
    public User getUserByuserLabel(String userLabel){
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserNoEqualTo(userLabel);
        List<User> list=userMapper.selectByExample(userExample);
        if (list.size()==1){
          return list.get(0);
        }else {
            return null;
        }

    }

    /**
     * 修改用户
     */
    public int updateUser(User user){
        return  userMapper.updateByPrimaryKeySelective(user);
    }

}
