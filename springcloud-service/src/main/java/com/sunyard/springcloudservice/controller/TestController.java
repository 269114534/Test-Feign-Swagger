package com.sunyard.springcloudservice.controller;

import com.sunyard.springcloudservice.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 动力节点QG
 * 2020/8/29
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test(){
        return testService.test();
    }
}
