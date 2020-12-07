package com.wxss.bootdubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

@Service
public class BootUserServiceImpl implements UserService {

    @Override
    public LoginResDto login(LoginReqDto loginReqDto) {
        LoginResDto reqDto = new LoginResDto();
        reqDto.setToken("phone");
        reqDto.setUsername("boot");
        return reqDto;
    }
}
