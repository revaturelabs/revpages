package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.beans.Post;
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
	
	public <S extends Post> List<S> save(Iterable<S> iterable){
		return postService.save(iterable);
	}
	
	public <S extends Post> S save(S post){
		return postService.save(post);
	}
	
	public Post findOne(Long id){
		return postService.findOne(id);
	}
	public List<Post> findAll(){
		return postService.findAll();
	}
	void delete(Long id){
		postService.delete(id);
	}
	void delete(Post post){
		postService.delete(post);
	}
	

	
}
