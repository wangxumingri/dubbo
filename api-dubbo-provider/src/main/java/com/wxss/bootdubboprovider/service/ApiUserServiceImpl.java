package com.wxss.bootdubboprovider.service;

import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

public class ApiUserServiceImpl implements UserService {

    @Override
    public LoginResDto login(LoginReqDto loginReqDto) {
        LoginResDto reqDto = new LoginResDto();
        reqDto.setToken("phone");
        reqDto.setUsername("boot");
        return reqDto;
    }
}
