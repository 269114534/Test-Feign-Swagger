package com.sunyard.springcloudservice.Service.Impl;

import com.sunyard.springcloudservice.Service.TestService;
import org.springframework.stereotype.Service;

/**
 * 动力节点QG
 * 2020/8/29
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "Feign的服务提供者";
    }
}
