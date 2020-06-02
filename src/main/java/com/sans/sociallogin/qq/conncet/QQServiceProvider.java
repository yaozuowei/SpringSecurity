package com.sans.sociallogin.qq.conncet;

import com.sans.sociallogin.qq.api.QQ;
import com.sans.sociallogin.qq.api.QQImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:28
 * @Description:用来整合QQOAuth2Template和AbstractOAuth2ApiBinding
 */
@Slf4j
public class QQServiceProvider extends AbstractOAuth2ServiceProvider<QQ> {

    private String appId;
    // 在QQ互联上可查到,此配置不变,将用户导向认证服务器的URL
    private static final String URL_AUTHORIZE = "https://graph.qq.com/oauth2.0/authorize";
    // 在QQ互联上可查到,此配置不变,申请令牌的URL
    private static final String URL_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token";

    // 默认的构造函数
    public QQServiceProvider(String appId, String appSecret) {
        /**
         * 在QQ互联注册时QQ互联分配的appId以及appSecret<br>
         * clientId---appId<br>
         * clientSecret---appSecret<br>
         * authorizeUrl---对应第一步导向的认证服务器<br>
         * accessTokenUrl---对应第四步申请令牌的地址<br>
         */
        super(new QQOAuth2Template(appId, appSecret, URL_AUTHORIZE, URL_ACCESS_TOKEN));
        this.appId = appId;
    }

    @Override
    public QQ getApi(String accessToken) {
        log.info("获取到用户accessToken值为:[{}]", accessToken);
        return new QQImpl(accessToken, appId);
    }
}
