package com.sans.SocialLogin.QQ.config;

import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactory;

/**
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/15:14
 * Description：从springboot1.5.6.RELEASE版本的org.springframework.boot.autoconfigure.social下拷贝的源码
 */
public abstract class SocialAutoConfigurerAdapter extends SocialConfigurerAdapter {

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer configurer,
                                       Environment environment) {
        configurer.addConnectionFactory(createConnectionFactory());
    }

    protected abstract ConnectionFactory<?> createConnectionFactory();

}