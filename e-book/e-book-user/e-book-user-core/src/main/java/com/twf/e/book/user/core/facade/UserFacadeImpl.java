package com.twf.e.book.user.core.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.user.api.facade.UsertFacade;
import com.twf.e.book.user.core.service.UserService;

@RestController
public class UserFacadeImpl implements UsertFacade{

	@Autowired
	private UserService userService;

	@Override
	public Integer login(String userName, String password) {
		return this.userService.login(userName, password);
	}
}
