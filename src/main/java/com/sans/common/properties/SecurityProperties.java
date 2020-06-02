package com.sans.common.properties;

import com.sans.sociallogin.qq.properties.SocialProperties;
import com.sans.oauth2.propertion.Oauth2ServerProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/12/10:37
 * @Description:
 */
@Data
@Component //将此类注入到spring容器中
@ConfigurationProperties(prefix = "nrsc.security") //指定以nrsc.security开头的配置会射入到该类中
public class SecurityProperties {
    SocialProperties social=new SocialProperties();

    /***认证服务器相关的配置*/
    private Oauth2ServerProperties oauth2 = new Oauth2ServerProperties();
}
