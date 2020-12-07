package com.example.commonprovider.service;

import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @package: com.example.commonprovider.service
 * @describe:
 * @author: ANGYU
 * @date: 2020-04-16 14:38
 */
//@Service
@Service
public class UserServiceImpl implements UserService {

    @Override
    public LoginResDto login(LoginReqDto loginReqDto) {
        LoginResDto resDto = new LoginResDto();
        resDto.setToken(UUID.randomUUID().toString());
        if ("phone".equals(loginReqDto.getLoginType())){
            resDto.setUsername("手机号登录");
        }else if("accout".equals(loginReqDto.getLoginType())){
            resDto.setUsername("账号登录");
        }
        resDto.setUserId("20890");

        return resDto;
    }
}
