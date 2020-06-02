package com.sans.security;

import com.sans.sociallogin.qq.pojo.MySocialUser;
import com.sans.core.entity.Role;
import com.sans.core.entity.User;
import com.sans.core.service.RoleService;
import com.sans.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/24/14:06
 * @Description:
 */
@Component
public class MyUserDetailsService  implements UserDetailsService, SocialUserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private HttpServletRequest request;

    /**
     * 表单登录
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userService.getUserByuserLabel(username);
        if (user==null){
            return null;
        }

        MyUserDetail myUserDetail=new MyUserDetail();
        myUserDetail.setUsername(username);
        myUserDetail.setPassword(user.getUserPassword());

        List<Role> roleList=roleService.findRoleByUser(user.getUserGuid());

        // 角色集合
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (Role role : roleList) {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleKey()));
        }
        myUserDetail.setAuthorities(authorities);
        return myUserDetail;
    }

    //第三方登录
    @Override
    public SocialUserDetails loadUserByUserId(String username) throws UsernameNotFoundException {
        User user=userService.getUserByuserLabel(username);
        if (user==null){
            return null;
        }
        List<Role> roleList=roleService.findRoleByUser(user.getUserGuid());
        // 角色集合
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (Role role : roleList) {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleKey()));
        }
        return new MySocialUser(username,user.getUserPassword(),true,true,true,true,authorities);
    }
}
