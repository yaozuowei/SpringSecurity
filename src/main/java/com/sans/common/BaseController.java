package com.sans.common;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;



/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/23/12:31
 * @Description:
 */
public class BaseController {


    /**
     * 获取登录人
     * @return
     */
    public String getLoginName() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principal instanceof UserDetails) {
                UserDetails userDetails = (UserDetails) principal;
                return userDetails.getUsername();
            }else {
                return (String)principal;
            }
    }
}
