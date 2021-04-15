package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

@Service(group = "sit") // dubbo的注解
public class UserServiceImpl  implements UserService {

    @Override
    public LoginResDto login(LoginReqDto loginReqDto) {
        System.out.println("UserServiceImpl 执行...");
        LoginResDto reqDto = new LoginResDto();
        reqDto.setToken("phone");
        reqDto.setUsername("服务实现1");

        return reqDto;
    }
}
