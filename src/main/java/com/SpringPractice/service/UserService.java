package com.SpringPractice.service;

import java.util.List;

import com.SpringPractice.entity.User;

public interface UserService {
	
	public String saveUser(User user);
	
	public User youngeAgeAndHighSalary();

}
