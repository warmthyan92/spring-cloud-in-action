package com.twf.e.book.user.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twf.e.book.user.core.persistence.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper UserMapper;
	
	public Integer login(String userName, String password) {
		return UserMapper.login(userName, password);
	}
}
