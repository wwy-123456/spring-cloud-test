package com.example.cloudclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 */
@FeignClient(name = "cloud-provider")
@Component
public interface ClientTestService {
    @RequestMapping("/test/test")
    public String getStr() throws Exception;
}
