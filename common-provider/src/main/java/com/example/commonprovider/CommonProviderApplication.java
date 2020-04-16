package com.example.commonprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
public class CommonProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonProviderApplication.class, args);
	}

}
