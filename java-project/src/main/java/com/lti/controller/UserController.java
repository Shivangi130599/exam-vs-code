package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.entity.User;
import com.lti.model.Status;
import com.lti.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser.lti")
	public Status register(@RequestBody User user) {
		userService.register(user);
		
		Status status = new Status();
		status.setMessage("User Registered Succesfully");
		return status;
		
	}
	
	
}
