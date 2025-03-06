package com.shop.cafe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Member;
import com.shop.cafe.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
//@CrossOrigin("http://192.168.144.1:8080/")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	//로그인
	@PostMapping("login") //GET일 때 @RequestBody 불가
	public Map<String, String> login(@RequestBody Member m, HttpServletRequest request) {
		System.out.println(m);
		Map<String, String> responseData = new HashMap();
		
		try {
			m = memberService.login(m);
			if(m != null) { //로그인 ok
				HttpSession session = request.getSession(); //session 가지고 왔니? (request는 웹 컨테이너가 제공해주는 객체 = 내장 객체)
				System.out.println(session.getId());
				session.setAttribute("member", m); //m 객체에 member라는 꼬리표 달기
				responseData.put("msg", "ok");
			} else { //로그인 fail
				responseData.put("msg", "다시 로그인해주세요");
			}
		} catch (Exception e) { //로그인을 처리하다가 에러가 난 상황
			e.printStackTrace();
			responseData.put("msg", "다시 로그인해주세요");
		}
		return responseData;
	}
	
	//회원가입
	@PostMapping("insertMember") //보안 때문에 get -> post로 변경
	//Member라는 객체에 똑같은 이름에 넣어주세요
	public Map<String, String> insertMember(@RequestBody Member m) {
		Map<String, String> responseData = new HashMap();
		try {
			memberService.insertMember(m);
			responseData.put("msg", "ok");
		} catch (Exception e) {
			e.printStackTrace();
			responseData.put("msg", e.getMessage());
		}
		
		return responseData;
	}

}

