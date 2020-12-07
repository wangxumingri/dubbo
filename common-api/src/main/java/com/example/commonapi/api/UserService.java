package com.example.commonapi.api;


import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

public interface UserService {
    LoginResDto login(LoginReqDto loginReqDto);
}
