package com.sans.SocialLogin.QQ.properties;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/15:05
 * @Description:
 */
@Data
public class QQProperties{

    //qq互联id
    private String appId;
    //qq互联appSecret
    private String appSecret;
    //服务提供商标识
    private String providerId="qq";
}
