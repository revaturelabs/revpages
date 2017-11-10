package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Post;
import com.revature.repository.PostRepository;

@RestController
public class PostService{
	private PostRepository postRepository;

	public PostRepository getPostRepository() {
		return postRepository;
	}

	@Autowired
	public void setPostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@PutMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public <S extends Post> List<S> save(Iterable<S> iterable){
		return postRepository.save(iterable);
	}
	
	@PutMapping(value = "/saveList", consumes = MediaType.APPLICATION_JSON_VALUE)
	public <S extends Post> S save(S post){
		return postRepository.save(post);
	}
	
	@GetMapping(value = "/findOne/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Post findOne(@PathVariable Long id){
		return postRepository.findOne(id);
	}
	
	@GetMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Post> findAll(){
		return postRepository.findAll();
	}
	
	@PostMapping(value = "/delete/{id}")
	public void delete(@PathVariable Long id){
		postRepository.delete(id);
	}
	@PostMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Post post){
		postRepository.delete(post);
	}
	
	

	
	
	
}
