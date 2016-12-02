package com.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.UserInfo;
import com.ssm.service.IUserInfoService;

@Controller
@RequestMapping("userController")
public class UserController {

	@Autowired
	private IUserInfoService service;
	
	@RequestMapping("Login")
	public String Login(HttpSession session,UserInfo user){
		user=service.Login(user);
		if(user!=null){
			session.setAttribute("user", user);
			return "index";
		}else{
			return "index";
		}
	}
}
