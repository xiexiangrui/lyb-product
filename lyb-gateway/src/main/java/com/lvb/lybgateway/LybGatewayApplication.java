package com.lvb.lybgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LybGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LybGatewayApplication.class, args);
    }
}
