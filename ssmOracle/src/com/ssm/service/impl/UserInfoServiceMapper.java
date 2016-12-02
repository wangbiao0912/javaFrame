package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserInfoMapper;
import com.ssm.entity.UserInfo;
import com.ssm.service.IUserInfoService;

@Service
public class UserInfoServiceMapper implements IUserInfoService {

	@Autowired
	private UserInfoMapper mapper;
	
	public UserInfo Login(UserInfo user) {
		// TODO Auto-generated method stub
		return mapper.Login(user);
	}

}
