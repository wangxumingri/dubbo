package com.wxss.bootdubboconsumer;

import com.alibaba.dubbo.config.*;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;

public class ApiDubboConsumerApplication {

    public static void main(String[] args) {
        // 设置当前服务应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        // 设置服务提供者应用名称
        applicationConfig.setName("api-dubbo-consumer");
        // 设置注册中心
        RegistryConfig registryConfig = new RegistryConfig("47.103.14.178:2181");
        registryConfig.setProtocol("zookeeper");

        // 引用配置
        ReferenceConfig<UserService> reference = new ReferenceConfig<UserService>();
        reference.setApplication(applicationConfig);
        reference.setRegistry(registryConfig);
        reference.setInterface(UserService.class);
        // 获取代理对象
        UserService userService = reference.get();
        LoginReqDto loginReqDto = new LoginReqDto();
        loginReqDto.setLoginId("111");
        loginReqDto.setLoginType("aaa");
        loginReqDto.setPassword("sss");
        LoginResDto result = userService.login(loginReqDto);

        System.out.println("调用结果:" + result);

//        SpringApplication.run(ApiDubboConsumerApplication.class, args);
    }

}
