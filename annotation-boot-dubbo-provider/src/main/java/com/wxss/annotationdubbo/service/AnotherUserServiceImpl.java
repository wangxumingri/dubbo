package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

//@Service(group = "uat",version = "1.0.0")
//@Service(group = "uat")
@Service(group = "local") // 使用分组区分本地和远程服务，避免他人调用到本地服务
public class AnotherUserServiceImpl implements UserService {

    @Override
    public LoginResDto login(LoginReqDto loginReqDto) {
        System.out.println("本地未修改分组，连接服务器上的注册中心...");
        System.out.println("集群3： AnotherUserServiceImpl 执行...");
//        System.out.println("集群2： AnotherUserServiceImpl 执行...");
        LoginResDto loginResDto = new LoginResDto();
//        loginResDto.setUsername("集群2：AnotherUserServiceImpl");
        loginResDto.setUsername("集群3：AnotherUserServiceImpl");

        return loginResDto;
    }
}
