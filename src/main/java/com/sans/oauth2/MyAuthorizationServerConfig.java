package com.sans.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/18/14:03
 * @Description: OAuth 授权服务器配置
 */
@Configuration
@EnableAuthorizationServer
public class MyAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired(required = false)
    AuthenticationManager authenticationManager;

    @Autowired
    private DataSource dataSource;

    /**
     * token存进redis
     */
    @Autowired
    private TokenStore tokenStore;

    /**
     * 生成jwt（JeesionWebToken）
     */
    @Autowired(required = false)
    private JwtAccessTokenConverter jwtAccessTokenConverter;

    /**
     * 添加扩展的TokenEnhancer设置到token的生成类中
     */
    @Autowired(required = false)
    private TokenEnhancer jwtTokenEnhancer;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager).userDetailsService(userDetailsService)
            .tokenStore(tokenStore);

        // 和我们扩展的TokenEnhancer设置到token的生成类中
        if (jwtAccessTokenConverter != null && jwtTokenEnhancer!=null) {
            //配置增强器链
            // 并利用增强器链将生成jwt的TokenEnhancer（jwtAccessTokenConverter）
            // 和我们扩展的TokenEnhancer设置到token的生成类中
            TokenEnhancerChain enhancerChain = new TokenEnhancerChain();
            List<TokenEnhancer> enhancers = new ArrayList<>();
            enhancers.add(jwtTokenEnhancer);
            enhancers.add(jwtAccessTokenConverter);
            enhancerChain.setTokenEnhancers(enhancers);
            endpoints.tokenEnhancer(enhancerChain);
            //将JwtAccessTokenConverter设置到token的生成类中
            endpoints.accessTokenConverter(jwtAccessTokenConverter);
        }
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        //解决Encoded password does not look like BCrypt报错
        //因为springsecurity在最新版本升级后,默认把之前的明文密码方式给去掉了
        //https://spring.io/blog/2017/11/01/spring-security-5-0-0-rc1-released#password-storage-updated
        security.passwordEncoder(NoOpPasswordEncoder.getInstance());

    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.jdbc(dataSource);
    }


}
