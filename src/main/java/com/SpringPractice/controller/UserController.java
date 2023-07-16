package com.SpringPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringPractice.entity.User;
import com.SpringPractice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/save")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		String saveUser = this.userService.saveUser(user);
		return new ResponseEntity<String>(saveUser,HttpStatus.OK);
	}
	
	@GetMapping(value = "/youngandhighsalary")
	public ResponseEntity<User> youngAndHighSalary(){
		User youngeAgeAndHighSalary = this.userService.youngeAgeAndHighSalary();
		return new ResponseEntity<User>(youngeAgeAndHighSalary,HttpStatus.OK);
	}
}
