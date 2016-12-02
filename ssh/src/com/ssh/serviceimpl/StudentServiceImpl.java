package com.ssh.serviceimpl;

import java.util.List;

import com.ssh.daoimpl.StudentDaoImpl;
import com.ssh.entity.Student;
import com.ssh.service.IStudentService;

public class StudentServiceImpl implements IStudentService{

	private StudentDaoImpl stuDao;
	public StudentDaoImpl getStuDao() {
		return stuDao;
	}
	public void setStuDao(StudentDaoImpl stuDao) {
		this.stuDao = stuDao;
	}

	public List<Student> selectStuAll() {
		// TODO Auto-generated method stub
		return this.stuDao.selectStuAll();
	}

}
