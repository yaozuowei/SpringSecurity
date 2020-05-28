package com.sans.common.util;

import com.sans.SocialLogin.QQ.properties.SocialProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/06/09:18
 * @Description:
 */

@Component
@Getter
@ConfigurationProperties(prefix = "typeutil")
public class TypeUtil {

    //登录成功返回
    public static String loginSuccessType;

    //登录失败返回
    public static String logintFailureType;

    //security不过滤
    public static String antMatchers;

    //oauth不过滤
    public static String oauthMatchers;

    //文件上传地址
    public static String profilePath;

    //rememberMe记住我设置token时间
    public static int tokenValiditySeconds;

    //同一用户在系统中只能登录一次
    public static int maximumSession;

    public void setMaximumSession(int maximumSession) {
        TypeUtil.maximumSession = maximumSession;
    }

    public void setLoginSuccessType(String loginSuccessType) {
        TypeUtil.loginSuccessType = loginSuccessType;
    }

    public void setLogintFailureType(String logintFailureType) {
        TypeUtil.logintFailureType = logintFailureType;
    }

    public void setAntMatchers(String antMatchers) {
        TypeUtil.antMatchers = antMatchers;
    }

    public void setProfilePath(String profilePath) {
        TypeUtil.profilePath = profilePath;
    }

    public void setTokenValiditySeconds(int tokenValiditySeconds) {
        TypeUtil.tokenValiditySeconds = tokenValiditySeconds;
    }

    public void setOauthMatchers(String oauthMatchers) {
        TypeUtil.oauthMatchers = oauthMatchers;
    }

    /**
     * 获取头像上传路径
     */
    public static String getAvatarPath()
    {
        return profilePath + "/avatar";
    }
}
