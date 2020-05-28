package com.sans.security.handler;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sans.common.util.TypeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/27/13:21
 * @Description:登录失败处理类
 */
@Slf4j
@Component
public class MyAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Autowired
    private  ObjectMapper objectMapper;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        /**
         * 判断是发送json还是页面请求
         */
        if (TypeUtil.logintFailureType.equals("JSON")) {
            log.info("登录失败");
            JSONObject res = new JSONObject();
            res.put("success",false);
            res.put("status",500);
            res.put("msg",exception.getMessage());
            response.setStatus(500);
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().append(res.toString());
        }else {
            response.setContentType("text/html;charset=UTF-8");
            //.onAuthenticationFailure(request, response, exception);
            String message = URLEncoder.encode(exception.getMessage(),"UTF-8");
            String path="/toLogin/loginErrCommon?error=true&message="+message;
            response.sendRedirect(path);
        }

    }
}
