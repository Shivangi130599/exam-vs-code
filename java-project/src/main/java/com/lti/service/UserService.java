package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.UserDao;
import com.lti.entity.User;

@Component
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void register(User user) {
		userDao.save(user);
	}

}
