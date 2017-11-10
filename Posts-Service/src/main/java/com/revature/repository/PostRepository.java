package com.revature.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

	<S extends Post> List<S> save(Iterable<S> iterable);
	<S extends Post> S save(S iterable);
	Post findOne(Long id);
	List<Post> findAll();
	void delete(Long id);
	void delete(Post post);

	
	
}
