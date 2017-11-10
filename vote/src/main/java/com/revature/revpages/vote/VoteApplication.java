package com.revature.revpages.vote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Microservice that stores the
 * Upvotes and Downvotes
 * for posts and their comments. 
 * 
 * @author pjw6193
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class VoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoteApplication.class, args);
	}

}
