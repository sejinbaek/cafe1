package com.shop.cafe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Member;
import com.shop.cafe.service.MemberService;

@RestController
@CrossOrigin("http://192.168.144.1:5500/")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
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

