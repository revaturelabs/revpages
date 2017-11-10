package com.revature.service;

import com.revature.model.User;

public interface UserService {
	User registerUser(User user);
	User login(User user);
}
