package com.sans.sociallogin.qq.conncet;

import com.sans.sociallogin.qq.api.QQUserInfo;
import com.sans.sociallogin.qq.api.QQ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/11/13:32
 * @Description:适配的API的类型为QQ
 */
@Slf4j
public class QQAdapter implements ApiAdapter<QQ> {

    @Override
    public boolean test(QQ api) {
        // 默认QQ永远是通的，实际上需要发送请求判断
        return true;
    }

    @Override
    public void setConnectionValues(QQ api, ConnectionValues values) {
        // Connection数据和API数据之间实现适配
        QQUserInfo userInfo = api.getUserInfo();
        log.info("从服务商获取用户信息:[{}]", userInfo);
        // 显示的用户名
        values.setDisplayName(userInfo.getNickname());
        // 用户头像
        values.setImageUrl(userInfo.getFigureurl_qq_1());
        // 个人主页(QQ不存在这个信息)
        values.setProfileUrl(null);
        // 服务商的用户ID
        values.setProviderUserId(userInfo.getOpenId());

    }

    @Override
    public UserProfile fetchUserProfile(QQ api) {
        // 绑定解绑
        return null;
    }

    @Override
    public void updateStatus(QQ api, String message) {
    // QQ不存在此类方法调用,本系统中只使用QQ登录,不进行用户分享之类的
    }
}
