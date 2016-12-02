package com.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Student;
import com.ssm.serviceimpl.StudentServiceImpl;
import com.ssm.util.Pager;

@Controller
@RequestMapping("StudentController")
public class StudentController {
	
	@Resource
	private StudentServiceImpl studentService;
	
	@RequestMapping("queryStudentInfoByPager")
	public ModelAndView queryStudentInfoByPager(Pager<Student> pager){
		ModelAndView mv = new ModelAndView();
		//定义变量，起始，结束
		 int beginIndex=0;
		 int endIndex=0;
		 //设置每页显示数据条数 为5条
		 pager.setPageSize(5);
		 //判断，如果页数小于1，设置默认值；反之，重新赋值
		 if(pager.getPageIndex()<1)
		 {	
			 beginIndex=1;
			 endIndex=5;
		 }
		 else
		 {
		     beginIndex=(pager.getPageIndex()-1)*pager.getPageSize()+1;
			 endIndex=pager.getPageIndex()*pager.getPageSize();
		 }
		 //赋值
		 pager.setPageIndex(beginIndex);
		 pager.setPageSize(endIndex);
		 //总条数
		 int num=this.studentService.queryTotal();
		 pager.setTotalRecords(num);
		 //总页数
		 pager.setTotalPages();
		 //将查询到的数据封装至集合
		 pager.setList(studentService.queryStudentByPager(beginIndex, endIndex));
		//通过实体模型存储当前查询集合对象数据
		mv.addObject("pager", pager);
		mv.setViewName("index");
		return mv;
	}

}
