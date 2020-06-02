package com.sans.sociallogin.qq.config;

import com.sans.sociallogin.MyConnectView;
import com.sans.sociallogin.qq.conncet.QQConnectionFactory;
import com.sans.sociallogin.qq.properties.QQProperties;
import com.sans.common.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.social.security.AuthenticationNameUserIdSource;
import org.springframework.web.servlet.View;


/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/15:14
 * @Description:如果系统中没有配置QQ的appId以及appSecret，此配置不起作用
 */
@Configuration
@EnableSocial
@ConditionalOnProperty(prefix = "nrsc.security.social.qq", name = "app-id")
public class QQAutoConfig extends SocialAutoConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    protected ConnectionFactory<?> createConnectionFactory() {
        QQProperties qqConfig = securityProperties.getSocial().getQq();
        // 创建连接工厂,初始化参数
        return new QQConnectionFactory(qqConfig.getProviderId(),qqConfig.getAppId(),qqConfig.getAppSecret());
    }

    /***
     * connect/qqConnected 绑定成功的视图
     * connect/qqConnect 解绑的视图
     * 实际访问地址 解绑connnect/**** yml文件配置的providerId值
     *
     * 两个视图写在一起，通过判断Model对象里有没有Connection对象来确定究竟是解绑还是绑定
     */
    @Bean({"connect/qqConnect", "connect/qqConnected"})
    //下面的注解的意思是当程序里有名字为qqConnectedView的bean
    // 我写的默认的qqConnectedView这个bean不会生效，也就是你可以写一个更好的bean来覆盖掉我的
    @ConditionalOnMissingBean(name = "qqConnectedView")
    public View qqConnectedView() {
        return new MyConnectView();
    }


    @Override
    public UserIdSource getUserIdSource() {
        return new AuthenticationNameUserIdSource();
    }
}
