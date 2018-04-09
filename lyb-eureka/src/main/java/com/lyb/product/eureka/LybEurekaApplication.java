package com.lyb.product.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: lyb-product
 * @description: 服务注册中心
 * @author: xiexiangrui
 * @create: 2018-04-09 12:01
 **/
@EnableEurekaServer
@SpringBootApplication
public class LybEurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(LybEurekaApplication.class, args);
    }
}