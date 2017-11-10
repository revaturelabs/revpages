package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.services.PostService;

public class PostController {
	private PostService postService;

	
	public PostService getPostService() {
		return postService;
	}

	@Autowired
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	

	
}
