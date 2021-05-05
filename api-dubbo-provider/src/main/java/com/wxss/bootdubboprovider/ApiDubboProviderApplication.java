package com.wxss.bootdubboprovider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.example.commonapi.api.UserService;
import com.wxss.bootdubboprovider.service.ApiUserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDubboProviderApplication {

    public static void main(String[] args) {
        // 设置当前服务应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        // 设置服务提供者应用名称
        applicationConfig.setName("api-dubbo-provider");
        // 设置注册中心
        RegistryConfig registryConfig = new RegistryConfig("47.103.14.178:2181");
        registryConfig.setProtocol("zookeeper");
        // 设置服务提供者协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20881);
        protocolConfig.setThreads(7);

        // 服务提供者实现
        UserService apiUserService = new ApiUserServiceImpl();
        ServiceConfig<UserService> service = new ServiceConfig<>();
        service.setApplication(applicationConfig);
        service.setRegistry(registryConfig);
        service.setProtocol(protocolConfig);
        service.setInterface(UserService.class);
        service.setRef(apiUserService);
        // 暴露协议
        service.export();

        SpringApplication.run(ApiDubboProviderApplication.class, args);
    }
}
