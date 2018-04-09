package com.lyb.product.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 18:15
 **/
@SpringBootApplication
@EnableAutoConfiguration
@EnableResourceServer
public class AuthApplication {
    public static void main(String[] args){
        SpringApplication.run(AuthApplication.class, args);
    }
}
