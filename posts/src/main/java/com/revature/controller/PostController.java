package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Post;
import com.revature.services.PostService;

@RestController
public class PostController{
	private PostService postService;

	public PostService getpostService() {
		return postService;
	}

	
	
	@Autowired
	public void setpostService(PostService postService) {
		this.postService = postService;
	}

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Post> save(@RequestBody Post post){
		return new ResponseEntity<>(postService.save(post), HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Post>> findAll(){
		return new ResponseEntity<>(postService.findAll(), HttpStatus.OK);
	}
	

	
	
	
}
