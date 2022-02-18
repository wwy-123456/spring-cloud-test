package com.example.cloudprovider.test.controller;

import com.example.cloudprovider.test.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String test() throws Exception{
        return testService.test();
    }
}
