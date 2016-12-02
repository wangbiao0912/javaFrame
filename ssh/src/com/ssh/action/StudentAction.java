package com.ssh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Student;
import com.ssh.serviceimpl.StudentServiceImpl;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StudentServiceImpl stuService;
	private List<Student> list;
	
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.list = this.stuService.selectStuAll();
		return SUCCESS;
	}
	
	
	public StudentServiceImpl getStuService() {
		return stuService;
	}
	public void setStuService(StudentServiceImpl stuService) {
		this.stuService = stuService;
	}
	public List<Student> getList() {
		return list;
	} 
	public void setList(List<Student> list) {
		this.list = list;
	}
 
}
