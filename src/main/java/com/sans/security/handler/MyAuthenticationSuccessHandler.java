package com.sans.security.handler;

import com.alibaba.fastjson.JSONObject;
import com.sans.common.util.TypeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/27/13:45
 * @Description:登录成功处理类
 */
@Slf4j
@Component
public class MyAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        if (TypeUtil.loginSuccessType.equals("JSON")) {
            log.info(authentication.getPrincipal()+"-----登录成功");
            JSONObject res = new JSONObject();
            res.put("success",true);
            res.put("status",200);
            res.put("msg","登录成功");

            response.setStatus(200);
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().append(res.toString());
        } else {
            // 会帮我们跳转到上一次请求的页面上
            //super.onAuthenticationSuccess(request, response, authentication);
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principal instanceof UserDetails) {
                UserDetails userDetails = (UserDetails) principal;
                System.out.println(userDetails.getUsername());
            }else {
                System.out.println(principal);
            }
            response.setContentType("text/html;charset=UTF-8");
            response.sendRedirect("/index/toIndex");
        }
    }
}
