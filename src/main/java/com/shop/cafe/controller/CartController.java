package com.shop.cafe.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
//@CrossOrigin("http://192.168.144.1:8080/")
public class CartController {
	
	@PostMapping("addCart")
	public String addCart(HttpServletRequest request) {
		HttpSession session = request.getSession(false); //false는 할당 받지 X
		System.out.println("addCart() 호출됨"+ session);
		return "ok";
	}

}
