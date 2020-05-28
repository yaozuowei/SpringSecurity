//package com.sans.oauth2;
//
//import com.sans.common.util.TypeUtil;
//import com.sans.oauth2.handler.MyAuthenticationFailureHandler2;
//import com.sans.oauth2.handler.MyAuthenticationSuccessHandler2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//
///**
// * Created with IntelliJ IDEA.
// *
// * @Auther: YaoZuoWei
// * @Date: 2020/05/18/14:03
// * @Description: oauth 资源服务器
// */
//@Configuration
//@EnableResourceServer
//public class MyResourcesServerConfig extends ResourceServerConfigurerAdapter{
//
//    @Autowired
//    MyAuthenticationFailureHandler2 myAuthenticationFailureHandler2;
//
//    @Autowired
//    MyAuthenticationSuccessHandler2 myAuthenticationSuccessHandler2;
//
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(TypeUtil.oauthMatchers.split(","))
//                .permitAll()
//                // 其他的需要登陆后才能访问说
//                .anyRequest().authenticated()
//                .and()
//                // 配置登录地址
//                .formLogin()
//                .loginProcessingUrl("/apiLogin")
//                // 配置登录成功自定义处理类
//                .successHandler(myAuthenticationSuccessHandler2)
//                // 配置登录失败自定义处理类
//                .failureHandler(myAuthenticationFailureHandler2)
//                .and()
//                // 开启跨域
//                .cors()
//                .and()
//                // 取消跨站请求伪造防护
//                .csrf().disable();
//    }
//}
