package com.crop.study.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService{
    @Override
    public String hiService(String name) {
        return "sorry "+name;
    }
}
