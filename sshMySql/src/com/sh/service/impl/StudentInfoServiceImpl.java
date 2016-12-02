package com.sh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.IStudentInfoDao;
import com.sh.entity.StudentInfo;
import com.sh.service.IStudentInfoService;

@Service
//ͨ��ע��������Ҫ�����������ĵط��ͼ���
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class StudentInfoServiceImpl implements IStudentInfoService {

	@Autowired
	private IStudentInfoDao dao;
	
	public List<StudentInfo> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

}
