package com.sans.SocialLogin.QQ.conncet;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

/**
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:32
 * Description：ConnectionSignUp类，需要注入到JdbcUsersConnectionRepository类里，
 * 以实现第三方登陆时免注册的逻辑功能
 */

//这代表是否注入spring 决定第三方登录是否回跳注册页 还是系统默认注册
//@Component
public class MyConnectionSignUp implements ConnectionSignUp {
    @Override
    public String execute(Connection<?> connection) {
        //这里其实应该向我们的用户业务表（user表）里插入一条数据
        //可以将插入user数据后的主键作为userId进行返回

        return connection.getDisplayName();
    }
}
