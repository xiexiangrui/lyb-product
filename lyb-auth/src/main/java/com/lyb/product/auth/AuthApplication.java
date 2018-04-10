package com.lyb.product.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 18:15
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AuthApplication {
    public static void main(String[] args){
        SpringApplication.run(AuthApplication.class, args);
    }
}
