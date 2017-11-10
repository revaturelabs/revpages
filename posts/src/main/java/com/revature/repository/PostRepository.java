package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{



	
	
}
