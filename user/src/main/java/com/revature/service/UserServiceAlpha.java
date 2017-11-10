package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.respository.UserRepository;

@Service("userService")
public class UserServiceAlpha implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
		userRepository.save(user);
		return userRepository.findByEmail(user.getEmail());
	}
	
	public User login(User user) {
		User storedUser = userRepository.findByEmail(user.getEmail());
		
		if(storedUser != null) {
			if(storedUser.getEmail().equals(user.getEmail()) &&
					storedUser.getPassword().equals(user.getPassword())) {
				return storedUser;
			}
		}
		
		//The user entered a non existing email.
		return new User();
	}
}
