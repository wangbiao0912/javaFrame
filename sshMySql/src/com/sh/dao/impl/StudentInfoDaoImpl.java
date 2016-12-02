package com.sh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.sh.dao.IStudentInfoDao;
import com.sh.entity.StudentInfo;

@Repository
public class StudentInfoDaoImpl extends HibernateDaoSupport implements IStudentInfoDao {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
	@SuppressWarnings("unchecked")
	public List<StudentInfo> queryAll() {
		// TODO Auto-generated method stub
		return this.getSessionFactory().getCurrentSession().createQuery("from StudentInfo").list();
	}

}
