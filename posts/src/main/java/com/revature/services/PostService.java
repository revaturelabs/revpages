package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Post;
import com.revature.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;


	
	public void setpostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	
	public Post save(Post post){
		return postRepository.save(post);
	}
	
	public List<Post> findAll(){
		return postRepository.findAll();
	}
	

	
}
