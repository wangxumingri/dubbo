package com.example.commonconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {
    private final Logger LOG = LoggerFactory.getLogger(UserController.class);

//    @Autowired   // 可以注入
//    @Reference   // 无法注入
    @Resource // 可以注入
    private UserService userService;

    @PostMapping("/login")
    public LoginResDto login(@RequestBody LoginReqDto loginReqDto){
        LOG.info("UserController#login 登录接收请求:{}",loginReqDto.toString());
        LoginResDto loginResDto = userService.login(loginReqDto);
        LOG.info("UserController#login 登录响应内容:{}",loginResDto);

        return loginResDto;

    }
}
