package com.sans.SocialLogin.QQ.config;

import com.sans.common.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.security.SpringSocialConfigurer;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:37
 * @Description:社交登陆的适配器
 */
@Configuration
@EnableSocial
public class SocialConfig extends SocialConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SecurityProperties securityProperties;

    /**
     * 并不一定所有的系统都会在用户进行第三方登陆时“偷偷地”给用户注册一个新用户
     * 所以这里需要标明required = false
     */
    @Autowired(required = false)
    private ConnectionSignUp connectionSignUp;

    @Override
    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
        /**
         * dataSource---数据源<br>
         * connectionFactoryLocator---连接工厂，辨别<br>
         * Encryptors.noOpText()---暂时采用不加密的方式，方便数据库查看<br>
         */
        JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource,
                connectionFactoryLocator, Encryptors.noOpText());
        // 设置表名前缀,数据库可以对表加前缀,需要注意windows和Linux系统的数据库区表名分大小写,如果报错找不到当前表,可以查看是否为此种情况
        repository.setTablePrefix("t_");

        //判断是否系统自动注册 无需跳转到注册页
        if (connectionSignUp != null) {
            //如果有spring容器里connectionSignUp这个bean时，将其注入到UsersConnectionRepository
            repository.setConnectionSignUp(connectionSignUp);
        }
        return repository;
    }

    /**
     * 社交登录配类
     * 过滤器链
     * @return
     */
    @Bean
    public SpringSocialConfigurer mySocialSecurityConfig() {
        String filterProcessesUrl=securityProperties.getSocial().getFilterProcessesUrl();
        MySpringSocialConfigurer configurer = new MySpringSocialConfigurer(filterProcessesUrl);
        //找不到qq匹配的用户跳转到注册页面
        configurer.signupUrl(securityProperties.getSocial().getSignUpUrl());
        return configurer;
    }


    /**
     * 注册和拿到social第三方登录用户信息
     * ProviderSignInUtils有两个作用：
     * （1）从session里获取封装了第三方用户信息的Connection对象
     * （2）将注册的用户信息与第三方用户信息（QQ信息）建立关系并将该关系插入到userconnection表里
     * 需要的两个参数：
     * （1）ConnectionFactoryLocator 可以直接注册进来，用来定位ConnectionFactory
     * （2）UsersConnectionRepository----》getUsersConnectionRepository(connectionFactoryLocator)
     * 即我们配置的用来处理userconnection表的bean
     *
     * @param connectionFactoryLocator
     * @return
     */
    @Bean
    public ProviderSignInUtils providerSignInUtils(ConnectionFactoryLocator connectionFactoryLocator) {
        return new ProviderSignInUtils(connectionFactoryLocator,
                getUsersConnectionRepository(connectionFactoryLocator)) {
        };
    }

}
