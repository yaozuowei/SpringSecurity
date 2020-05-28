package com.sans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class SpringBootSecurityDemoApplicationTests {


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    /**
     * 注册用户
     */
    @Test
    public void contextLoads() {
        // 注册用户
       System.out.println(bCryptPasswordEncoder.encode("456"));
    }

}