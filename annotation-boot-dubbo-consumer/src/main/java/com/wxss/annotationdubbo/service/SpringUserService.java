package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commonapi.api.UserService;
import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import org.springframework.stereotype.Component;

/**
 * spring的service
 */
@Component
public class SpringUserService {

//    @Reference(group = "uat",version = "1.0.0") // dubbo的注解:引用dubbo服务
//    @Reference(group = "*") // dubbo的注解:引用dubbo服务
//    @Reference(group = "uat",cluster = "forking") // 并行调用多个服务器，只要一个成功即返回
//    @Reference(group = "uat",cluster = "failback") // 失败自动恢复，后台记录失败请求，定时重发。通常用于消息通知操作
//    @Reference(group = "uat",cluster = "failover") //
//    @Reference(group = "uat",cluster = "failover",loadbalance = "roundRobin") // 轮询：按公约后的权重设置轮询比率
//    @Reference(group = "uat",cluster = "failover",loadbalance = "consistentHash") //相同参数的请求总是发到同一提供者。
//    @Reference(group = "uat",url = "dubbo://47.103.14.178:20880") //相同参数的请求总是发到同一提供者。
//    @Reference(group = "uat") //
    @Reference(group = "local") //
    private UserService userService;

    public LoginResDto login(LoginReqDto loginReqDto) {
        return userService.login(loginReqDto);
    }
}
