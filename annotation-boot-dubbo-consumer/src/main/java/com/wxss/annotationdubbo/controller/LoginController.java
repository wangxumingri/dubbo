package com.wxss.annotationdubbo.controller;

import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import com.wxss.annotationdubbo.service.SpringUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class LoginController {

    @Autowired
    private SpringUserService springUserService;


    @RequestMapping("login")
    public LoginResDto login(LoginReqDto loginReqDto){
        return springUserService.login(loginReqDto);
    }
}
