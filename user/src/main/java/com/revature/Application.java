package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.revature.model.User;
import com.revature.service.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
	@Override
    public void run(String... args) throws Exception {
		UserService userService = context.getBean(UserService.class);
		userService.registerUser(new User(0,"palagnajr@gmail.com","1234","MODERATOR"));
		userService.registerUser(new User(0,"TEST@gmail.com","1234","USER"));
    }
}

