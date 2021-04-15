package com.wxss.annotationdubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.wxss.annotationdubbo.service")// 扫描被dubbo的 @Service 注解标记的类
@PropertySource("classpath:/dubbo-provider.properties")// 引入dubbo服务提供者公共配置
public class AnnotationDubboProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(AnnotationDubboProviderApp.class,args);
    }
}
