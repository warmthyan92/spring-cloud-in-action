package com.twf.e.book.user.api.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface UsertFacade {

	@RequestMapping(value="login",method=RequestMethod.GET)
	public Integer login(@RequestParam("userName")String userName,@RequestParam("password")String password);
}
