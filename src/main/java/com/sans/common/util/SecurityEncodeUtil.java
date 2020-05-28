package com.sans.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/05/07/10:55
 * @Description: springSecurity加密
 */
public class SecurityEncodeUtil {

    @Autowired
    private static BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * security加密
     * @param password
     * @return
     */
    public static String encode(String password){
        return bCryptPasswordEncoder.encode(password);
    }
}
