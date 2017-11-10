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

import com.revature.services.TagService;
import com.revature.beans.TagPostBean;
import com.revature.beans.Post;
import com.revature.beans.TagBean;

@RestController
public class TagController {
	
	private TagService ts;
	public TagService gettagervice() {
		return ts;
	}	
	@Autowired
	public void settagService(TagService tagService) {
		this.ts = tagService;
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
