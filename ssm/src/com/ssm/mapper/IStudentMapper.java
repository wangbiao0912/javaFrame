package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.Student;


public interface IStudentMapper {
	//注意，如果是以面向接口的思想模式编程，则此处方法名必须与相应配置xml文件中的select中的id相同
	public List<Student> selectStudentAll();
	
	public int queryTotal();
	
	public List<Student> queryStudentInfoByPager(int beginIndex,int endIndex);
	
}
