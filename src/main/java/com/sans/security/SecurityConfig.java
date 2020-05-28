package com.sans.security;

import com.sans.common.util.TypeUtil;
import com.sans.security.handler.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.security.SpringSessionBackedSessionRegistry;
import org.springframework.social.security.SpringSocialConfigurer;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/24/14:36
 * @Description:
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启权限注解,默认是关闭的
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 自定义登录成功处理器
     */
    @Autowired
    private UserLoginSuccessHandler userLoginSuccessHandler;
    /**
     * 自定义登录失败处理器
     */
    @Autowired
    private UserLoginFailureHandler userLoginFailureHandler;
    /**
     * 自定义注销成功处理器
     */
    @Autowired
    private UserLogoutSuccessHandler userLogoutSuccessHandler;
    /**
     * 自定义暂无权限处理器
     */
    @Autowired
    private UserAuthAccessDeniedHandler userAuthAccessDeniedHandler;
    /**
     * 自定义未登录的处理器
     */
    @Autowired
    private UserAuthenticationEntryPointHandler userAuthenticationEntryPointHandler;
    /**
     * 自定义登录逻辑验证器
     */
    @Autowired
    private UserAuthenticationProvider userAuthenticationProvider;

    /**
     * 登录失败通用处理器
     */
    @Autowired
    private MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    /**
     * 登录成功通用处理类
     */
    @Autowired
    private MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;

    /**
     * 自定义验证码过滤器
     */
    @Autowired
    private ValidateCodeFilter validateCodeFilter;

    /**
     * 第三方登录qq
     */
    @Autowired
    private SpringSocialConfigurer mySocialSecurityConfig;



    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PasswordEncoder passwordEncoder;


    /**
     * 加密方式
     *
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    /**
     * 注入自定义PermissionEvaluator
     */
    @Bean
    public DefaultWebSecurityExpressionHandler userSecurityExpressionHandler(){
        DefaultWebSecurityExpressionHandler handler = new DefaultWebSecurityExpressionHandler();
        handler.setPermissionEvaluator(new UserPermissionEvaluator());
        return handler;
    }

    /**
     * 记住我
     * @return
     */
    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
       // tokenRepository.setCreateTableOnStartup(true);  //系统在启动的时候生成“记住我”的数据表（只能使用一次）
        return tokenRepository;
    }

    /**
     * 配置登录验证逻辑
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //这里可启用我们自己的登陆验证逻辑
        auth.authenticationProvider(userAuthenticationProvider);

        //生成token jwt需要
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }

    /***
     * 生成token jwt需要
     * 真正将AuthenticationManager注入到spring容器
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 集群环境下 session并发的配置 只允许一个账号登录
     */
    @Autowired
    private FindByIndexNameSessionRepository sessionRepository;

    @Bean
    SpringSessionBackedSessionRegistry sessionRegistry() {
        return new SpringSessionBackedSessionRegistry(sessionRepository);
    }


    /**
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 将自定义的验证码过滤器放置在 UsernamePasswordAuthenticationFilter 之前
        http.addFilterBefore(validateCodeFilter, UsernamePasswordAuthenticationFilter.class);
                //第三方qq登录
        http.apply(mySocialSecurityConfig);
        http.authorizeRequests()
                .antMatchers(TypeUtil.antMatchers.split(","))
                .permitAll()
                // 其他的需要登陆后才能访问
                .anyRequest().authenticated()
                .and()
                // 配置未登录自定义处理类
//                .httpBasic().authenticationEntryPoint(userAuthenticationEntryPointHandler)
//                .and()
                // 配置登录地址
                .formLogin()
                .loginPage("/toLogin")
                .loginProcessingUrl("/login")
                // 配置登录成功自定义处理类
                .successHandler(myAuthenticationSuccessHandler)
//                .defaultSuccessUrl("/index/toIndex")
                // 配置登录失败自定义处理类
                .failureHandler(myAuthenticationFailureHandler)
//                .failureUrl("/toLogin")
                .and()
                //记住我设置
                .rememberMe()
                .tokenRepository(persistentTokenRepository())
                //设置记住我Token的有效时间
                .tokenValiditySeconds(TypeUtil.tokenValiditySeconds)
                //验证记住我
                .userDetailsService(userDetailsService)

                .and()
                // 配置登出地址
                .logout()
                .logoutUrl("/quit")
                // 配置用户登出自定义处理类
//                .logoutSuccessHandler(userLogoutSuccessHandler)
                .logoutSuccessUrl("/toLogin")
                // 退出登录删除指定的cookie
                .deleteCookies("JSESSIONID")

                .and()
                // 配置没有权限自定义处理类
                .exceptionHandling().accessDeniedHandler(userAuthAccessDeniedHandler)
                .and()

                // 开启跨域
                .cors()
                .and()
                // 取消跨站请求伪造防护
                .csrf().disable();

        // 允许iframe内呈现
        http.headers().frameOptions().disable();

        http.sessionManagement()
                //session过期跳转地址
                // .invalidSessionUrl("/toLogin")
                // 设置同一个用户只能有一个登陆session
                .maximumSessions(TypeUtil.maximumSession)
                //集群环境下 session并发的配置 只允许一个账号登录
                .sessionRegistry(sessionRegistry())
                // 其他地方登录session失效处理策略
                .expiredSessionStrategy(new MySessionInformationExpiredStrategy());
                // 其他地方登录session失效处理URL
                //.expiredUrl("/toLogin/session/expired");
    }



}