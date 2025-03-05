package com.shop.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication //SprintBootApplication 시작이야
@PropertySource("classpath:config/secu.properties")
//classpath는 resouces 의미
public class Project1CafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1CafeApplication.class, args);
	}

}
