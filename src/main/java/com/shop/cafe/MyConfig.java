package com.shop.cafe;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class MyConfig implements WebMvcConfigurer {

//	@Override
//	public void addCorsMappings(CorsRegistry registry) { //모든 URL Mapping
//		registry.addMapping("/**").allowedOrigins("http://localhost:8080/")
//		.allowedMethods("*").allowedHeaders("*").allowCredentials(true);
//	}
}
