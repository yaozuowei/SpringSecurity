package com.sans.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/28/10:15
 * @Description:
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg){
        super(msg);
    }
}
