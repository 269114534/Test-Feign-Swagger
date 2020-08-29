package com.sunyard.springcloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringcloudServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceApplication.class, args);
    }

}
