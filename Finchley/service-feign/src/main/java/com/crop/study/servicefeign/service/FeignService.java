package com.crop.study.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(String name);

}



