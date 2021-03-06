package com.sans.oauth2;

import com.sans.common.properties.SecurityProperties;
import com.sans.oauth2.jwt.MyJwtTokenEnhancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/20/16:02
 * @Description:
 */
@Configuration
public class TokenStoreConfig {

    /***
     * RedisTokenStore需要一个连接工厂，这里可以直接注入进来
     */
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;


    /***
     * 将RedisTokenStore注入到spring容器
     * 当yml配置文件里配置了nrsc.security.oauth2.tokenStore = redis时 ---> 下面的配置生效
     * @return
     */
    @ConditionalOnProperty(prefix = "nrsc.security.oauth2", name = "tokenStore", havingValue = "redis")
    @Bean
    public TokenStore redisTokenStore() {
        return new RedisTokenStore(redisConnectionFactory);
    }


    /***
     * 当yml配置文件里配置了nrsc.security.oauth2.tokenStore = jwt或者根本就没配置该属性时 ---> 下面的配置生效
     */
    @Configuration
    @ConditionalOnProperty(prefix = "nrsc.security.oauth2", name = "tokenStore", havingValue = "jwt", matchIfMissing = true)
    public static class JwtConfig {

        @Autowired
        private SecurityProperties securityProperties;

        /***
         * 配置JwtTokenStore ---> TokenStore只负责token的存储，不负责token的生成
         * @return
         */
        @Bean
        public TokenStore jwtTokenStore() {
            return new JwtTokenStore(jwtAccessTokenConverter());
        }

        /***
         * JwtAccessTokenConverter 其实就是一个TokenEnhancer
         * 通过阅读源码可知：TokenEnhancer是对生成的Token进行后续处理的（或者说增强），
         * 其实JwtAccessTokenConverter就是将默认生成的token做进一步处理使其成为一个JWT
         * @return
         */
        @Bean
        public JwtAccessTokenConverter jwtAccessTokenConverter() {
            JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
            //加入密签 --- 一定要保护好
            converter.setSigningKey(securityProperties.getOauth2().getJwtSigningKey());
            return converter;
        }

        /***
         * 将自定义的TokenEnhancer注入到spring容器
         * @return
         */
        @Bean
        @ConditionalOnBean(TokenEnhancer.class)
        public TokenEnhancer jwtTokenEnhancer() {
            return new MyJwtTokenEnhancer();
        }
    }
}
