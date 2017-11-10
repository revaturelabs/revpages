package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	
}
