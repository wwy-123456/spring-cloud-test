package com.example.cloudclient.controller;

import com.example.cloudclient.service.ClientTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")
public class clientTestController {

    @Resource
    private ClientTestService clientTestService;

    @RequestMapping("/getStr")
    public String getStr() throws Exception {
        return clientTestService.getStr();
    }
}
