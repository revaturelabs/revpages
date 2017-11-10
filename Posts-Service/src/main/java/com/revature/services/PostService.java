package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.repository.PostRepository;

public class PostService {
	private PostRepository postRepository;

	public PostRepository getPostRepository() {
		return postRepository;
	}

	@Autowired
	public void setPostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	

	
	
	
}
