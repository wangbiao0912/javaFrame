package com.sh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sh.entity.StudentInfo;
import com.sh.service.impl.StudentInfoServiceImpl;

@Controller
@RequestMapping("StuController")
public class StuController {
	
	@Autowired
	private StudentInfoServiceImpl service;
	
	@RequestMapping("queryAll")
	public String queryAll(Model model){
		List<StudentInfo> list=service.queryAll();
		
		model.addAttribute("list", list);
		return "index";
	}

}
