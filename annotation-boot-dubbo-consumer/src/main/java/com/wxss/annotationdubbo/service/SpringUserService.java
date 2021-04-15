package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import org.springframework.stereotype.Component;

/**
 * spring的service
 */
@Component
public class SpringUserService {

//    @Reference(group = "uat",version = "1.0.0") // dubbo的注解:引用dubbo服务
    @Reference(group = "*") // dubbo的注解:引用dubbo服务
    private UserService userService;

    public LoginResDto login(LoginReqDto loginReqDto) {
        return userService.login(loginReqDto);
    }
}
