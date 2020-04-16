package com.example.commonconsumer.controller;

import com.example.commonapi.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    // 用dubbo的@Reference无法注入
    @Autowired
    private UserService userService;

    @RequestMapping("/say")
    public Map say(){
        Map<String, Object> login = userService.login("root", "root");
        System.out.println(login);
        return login;
    }
}
