package com.wxss.bootdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @Reference // 注入的是代理对象
    private UserService userService;

    @PostMapping("/login")
    public LoginResDto login(@RequestBody LoginReqDto loginReqDto) {
        LOG.info("LoginController#login 登录接收请求:{}", loginReqDto.toString());
        LoginResDto loginResDto = userService.login(loginReqDto);
        LOG.info("LoginController#login 登录响应内容:{}", loginResDto);

        return loginResDto;
    }
}
