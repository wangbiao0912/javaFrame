package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Student;

public interface IStudentDao {
	public List<Student> selectStuAll();
}
