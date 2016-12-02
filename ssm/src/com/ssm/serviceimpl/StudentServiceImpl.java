package com.ssm.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.entity.Student;
import com.ssm.mapper.IStudentMapper;
import com.ssm.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentMapper studentMaper;
	
	public List<Student> queryStudentByPager(int beginIndex, int endIndex) {
		// TODO Auto-generated method stub
		return this.studentMaper.queryStudentInfoByPager(beginIndex, endIndex);
	}

	public int queryTotal() {
		// TODO Auto-generated method stub
		return this.studentMaper.queryTotal();
	}

	public List<Student> selectStudentAll() {
		// TODO Auto-generated method stub
		return this.studentMaper.selectStudentAll();
	}

}
