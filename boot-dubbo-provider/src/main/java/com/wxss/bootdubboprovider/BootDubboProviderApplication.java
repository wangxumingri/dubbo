package com.wxss.bootdubboprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo // 开启dubbo 注解扫描
public class BootDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDubboProviderApplication.class, args);
    }

}
