package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.respository.UserRepository;

@Service("userService")
public class UserServiceAlpha implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void registerUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
