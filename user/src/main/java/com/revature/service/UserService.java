package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.model.User;

public interface UserService {
	void registerUser(User user);
	List<User> getAllUsers();
}
