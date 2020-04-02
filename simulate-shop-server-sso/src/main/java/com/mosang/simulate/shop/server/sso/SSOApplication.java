package com.mosang.simulate.shop.server.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SSOApplication {
    public static void main(String[] args) {
        SpringApplication.run(SSOApplication.class,args);
    }

}
