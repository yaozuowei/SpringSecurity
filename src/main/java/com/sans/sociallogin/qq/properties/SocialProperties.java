package com.sans.sociallogin.qq.properties;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/15:09
 * @Description:
 */
@Data
public class SocialProperties {
    private String filterProcessesUrl = "/qqLogin";

    private String SignUpUrl="toLogin/register";

    private QQProperties qq=new QQProperties();

}
