package com.sans.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/24/14:36
 * @Description:自定义登录验证
 */
@Component
public class UserAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private SessionStrategy sessionStrategy;

    @Autowired
    private HttpServletRequest request;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 获取表单输入中返回的用户名
        String userName = (String) authentication.getPrincipal();
        // 获取表单中输入的密码
        String password = (String) authentication.getCredentials();

        MyUserDetail myUserDetail = (MyUserDetail) myUserDetailsService.loadUserByUsername(userName);
        if (myUserDetail==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 我们还要判断密码是否正确，这里我们的密码使用BCryptPasswordEncoder进行加密的
        if (!new BCryptPasswordEncoder().matches(password, myUserDetail.getPassword())) {
            throw new BadCredentialsException("密码不正确");
        }
        sessionStrategy.setAttribute(new ServletWebRequest(request),"principal",userName);
        // 进行登录
        return new UsernamePasswordAuthenticationToken(userName, password, myUserDetail.getAuthorities());
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}