package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import com.revature.model.User;
import com.revature.service.UserService;

@SpringBootApplication
@EnableDiscoveryClient
public class Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserService service = context.getBean(UserService.class);
		service.registerUser(new User(0,"palagnajr@gmail.com","1234","MODERATOR"));
		service.registerUser(new User(0,"test@gmail.com","1234","USER"));
	}
}

