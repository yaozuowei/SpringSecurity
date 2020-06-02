package com.sans.sociallogin.qq.conncet;

import com.sans.sociallogin.qq.api.QQ;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:35
 * @Description:
 */
public class QQConnectionFactory extends OAuth2ConnectionFactory<QQ> {
    /**
     * 创建连接工厂构造函数
     *
     * @param providerId QQ的openId
     * @param appId QQ互联AppId
     * @param appSecret  QQ互联appSecret
     */
    public QQConnectionFactory(String providerId, String appId, String appSecret) {

        super(providerId, new QQServiceProvider(appId, appSecret), new QQAdapter());
    }
}
