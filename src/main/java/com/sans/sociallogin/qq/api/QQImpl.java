package com.sans.sociallogin.qq.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:14
 * @Description:QQ获取用户实现类
 */
@Slf4j
public class QQImpl extends AbstractOAuth2ApiBinding implements QQ{

    // 根据用户access_token获取用户openId
    private static final String URL_GET_OPENID = "https://graph.qq.com/oauth2.0/me?access_token=%s";
    // 根据系统appId以及用户openId获取用户信息(access_token值的绑定已经在父类中实现)
    private static final String URL_GET_USERINFO = "https://graph.qq.com/user/get_user_info?oauth_consumer_key=%s&openid=%s";

    // accessToken由父类处理,当前类不处理

    // QQ互联注册到的APPID,在系统中属于唯一值
    private String appId;

    // 每一个用户QQ互联给出的唯一标识
    private String openId;

    private ObjectMapper objectMapper = new ObjectMapper();


    /**
     * 构造函数(openId根据accessToken去QQ互联获取,不需要传入)
     * @param accessToken 走完oAuth流程获取到的令牌
     * @param appId 系统appId
     */
    public QQImpl(String accessToken, String appId) {
        // 父类默认是放在请求头，QQ要求是将accessToken作为参数传入,此时系统会将accessToken作为参数组装到URL_GET_USERINFO里面
        super(accessToken, TokenStrategy.ACCESS_TOKEN_PARAMETER);
        // appId
        this.appId = appId;
        // 使用accessToken替换URL_GET_OPENID的%s
        String url = String.format(URL_GET_OPENID, accessToken);
        String result = getRestTemplate().getForObject(url, String.class);
        log.info("调用腾讯QQ登录，返回值为[{}]", result);
        // 发送请求获取openId
        this.openId = StringUtils.substringBetween(result, "\"openid\":\"", "\"}");
    }

    @Override
    public QQUserInfo getUserInfo() {
        // accessToken在类初始化时已经实现
        // 将appId和openId更换到URL_GET_USERINFO字符串中
        String url = String.format(URL_GET_USERINFO, appId, openId);
        String result = getRestTemplate().getForObject(url, String.class);
        log.info("调用腾讯QQ登录,接口为:[{}]获取用户信息为[{}]", url, result);
        // 将返回的用户信息转换成QQUserInfo类型，如果转换失败则代表获取用户信息失败
        QQUserInfo userInfo = null;
        try {
            // 将JSON格式字符串转换成QQUserInfo对象
            userInfo = objectMapper.readValue(result, QQUserInfo.class);
            userInfo.setOpenId(openId);
            return userInfo;
        } catch (Exception e) {
            throw new RuntimeException("获取用户信息失败", e);
        }
    }
}
