package com.mosang.simulate.shop.feign.controller;

import com.mosang.simulate.shop.feign.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mosang.simulate.shop.feign.service.UserFeignService;

@RestController
public class UserController {
    @Autowired
    private UserFeignService UserFeignService;

    @RequestMapping(value = "sayHi",method = RequestMethod.GET)
    public String sayHi(String message){
        return UserFeignService.sayHi(message);
    }

}
