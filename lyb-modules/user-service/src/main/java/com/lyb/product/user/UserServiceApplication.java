package com.lyb.product.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 17:10
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lyb.product.user.mapper")
public class UserServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
