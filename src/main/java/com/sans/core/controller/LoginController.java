package com.sans.core.controller;

import com.sans.SocialLogin.QQ.pojo.SocialUserInfo;
import com.sans.common.BaseController;
import com.sans.common.MyConstants;
import com.sans.common.entity.ImageCode;
import com.sans.common.util.ImageCodeUtil;
import com.sans.core.entity.Menu;
import com.sans.core.entity.User;
import com.sans.core.service.RmService;
import com.sans.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/23/12:29
 * @Description:
 */
@RequestMapping("/toLogin")
@Controller
public class LoginController extends BaseController {

    @Resource(name = "UserService")
    private UserService userService;

    @Autowired
    private SessionStrategy sessionStrategy;

    @Resource(name = "RmService")
    private RmService rmService;

    /**
     * 获取第三方登录人信息
     */
    @Autowired
    private ProviderSignInUtils providerSignInUtils;


    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = {""})
    public String index(Model model){
        //是否登陆过
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth instanceof AnonymousAuthenticationToken) {
            return "login";
        }else {
            User user=userService.getUserByuserLabel(getLoginName());
            List<Menu> list=rmService.findAllMenuByUserNo(getLoginName());
            model.addAttribute("user",user);
            model.addAttribute("menus",list);
            return "index";
        }
    }

    /**
     * 图片验证码
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/images/code")
    @ResponseBody
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageCode imageCode = ImageCodeUtil.generate(new ServletWebRequest(request));
        //由于session集群管理不能传image
        ImageCode imageCodePl=new ImageCode(imageCode.getCode(),imageCode.getExpireTime());
        sessionStrategy.setAttribute(new ServletWebRequest(request), MyConstants.SESSION_KEY, imageCodePl);
        ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());
    }

    /**
     * session过期
     */
    @GetMapping("/session/invalid")
    public String sessionInvalid(){
        return "login";
    }

    /**
     * 登录下线界面
     */
    @GetMapping("/session/expired")
    public String sessionExpired(){
        return "error/unauth";
    }

    /**
     * 登录失败通用返回页面
     */
    @GetMapping("/loginErrCommon")
    public String loginErrCommon(){
        return "error/loginErrCommon";
    }


    /**
     * 获取第三方用户信息
     *
     * @param request
     * @return
     */
    @GetMapping("/social/user")
    public SocialUserInfo getSocialUserInfo(HttpServletRequest request) {
        SocialUserInfo userInfo = new SocialUserInfo();
        //从session里取出封装了第三方信息QQ用户信息）的Connection对象
        Connection<?> connection = providerSignInUtils.getConnectionFromSession(new ServletWebRequest(request));
        userInfo.setProviderId(connection.getKey().getProviderId());
        userInfo.setProviderUserId(connection.getKey().getProviderUserId());
        userInfo.setNickName(connection.getDisplayName());
        userInfo.setHeadImg(connection.getImageUrl());
        return userInfo;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    public String registerUser(User user){
        //第三方登录如果跳入注册界面触发 默认系统自动注册

        //不管是注册用户还是绑定用户，都会拿到一个用户唯一标识，如用户名。
        String userId = user.getUserNo();
        //将用户userId和第三方用户信息建立关系并将其插入到userconnection表
        //providerSignInUtils.doPostSignUp(userId, new ServletWebRequest(request));

        //使用我们自己的utils将用户userId和第三方用户信息建立关系、将该关系插入到userconnection表
        //和删掉redis中保存的deviceId信息
        //appSignUpUtils.doPostSignUp(new ServletWebRequest(request), userId);
        return "/index/toIndex";
    }
}
