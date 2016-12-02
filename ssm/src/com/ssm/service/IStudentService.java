package com.ssm.service;

import java.util.List;

import com.ssm.entity.Student;

public interface IStudentService {
	
	public List<Student> selectStudentAll();
	
	public int queryTotal();
	
	public List<Student> queryStudentByPager(int beginIndex,int endIndex);
	
}
