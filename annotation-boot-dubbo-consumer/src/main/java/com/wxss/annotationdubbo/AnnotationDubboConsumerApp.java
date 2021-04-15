package com.wxss.annotationdubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/dubbo-consumer.properties")// 引入dubbo服务消费者公共配置
@EnableDubbo(scanBasePackages = "com.wxss.annotationdubbo.controller")
public class AnnotationDubboConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(AnnotationDubboConsumerApp.class,args);
    }
}
