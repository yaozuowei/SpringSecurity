package com.sans.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/28/09:41
 * @Description:SessionStrategy注入spring
 */
@Configuration
public class AppConfig {

    @Bean("sessionStrategy")
    public SessionStrategy registBean() {
        SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();
        return sessionStrategy;
    }
}
