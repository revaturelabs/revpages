package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.service.UserService;
import com.revature.util.FinalUtil;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User user) {
		User loggedUser = userService.login(user);
		
		//User had the wrong credentials
		if(loggedUser.getEmail().equals(FinalUtil.EMPTY_STRING)) {
			return new ResponseEntity<User>(HttpStatus.UNAUTHORIZED);
		}
		
		//User authenticated
		return new ResponseEntity<User>(loggedUser, HttpStatus.OK);
	}
}
