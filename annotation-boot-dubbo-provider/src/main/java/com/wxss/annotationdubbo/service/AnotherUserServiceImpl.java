package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

//@Service(group = "uat",version = "1.0.0")
@Service(group = "uat")
public class AnotherUserServiceImpl implements UserService {

    @Override
    public LoginResDto login(LoginReqDto loginReqDto) {
        System.out.println("AnotherUserServiceImpl 执行...");
        LoginResDto loginResDto = new LoginResDto();
        loginResDto.setUsername("服务实现2");

        return loginResDto;
    }
}
