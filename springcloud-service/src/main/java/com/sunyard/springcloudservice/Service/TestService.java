package com.sunyard.springcloudservice.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 动力节点QG
 * 2020/8/29
 */
@FeignClient(name = "postloan-service")
public interface TestService {

    @RequestMapping("/test")
    public String test();
}
