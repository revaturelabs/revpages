package com.revature.revpages.vote.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.revpages.vote.beans.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
	public List<Vote> findByPostId(long postId);
}
