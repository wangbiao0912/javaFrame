package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.Student;


public interface IStudentMapper {
	//ע�⣬�����������ӿڵ�˼��ģʽ��̣���˴���������������Ӧ����xml�ļ��е�select�е�id��ͬ
	public List<Student> selectStudentAll();
	
	public int queryTotal();
	
	public List<Student> queryStudentInfoByPager(int beginIndex,int endIndex);
	
}
