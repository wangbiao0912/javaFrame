package com.ssh.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ssh.dao.IStudentDao;
import com.ssh.entity.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements IStudentDao {

	public List<Student> selectStuAll() {
		// TODO Auto-generated method stub
		List<Student> list = this.getSessionFactory().getCurrentSession().createQuery("from Student").list();
		return list;
	}

}
