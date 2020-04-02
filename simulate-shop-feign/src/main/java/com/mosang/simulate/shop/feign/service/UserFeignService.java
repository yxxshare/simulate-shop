package com.mosang.simulate.shop.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "serverUser")
public interface UserFeignService {
    @RequestMapping(value = "sayHi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message")String message);
}
