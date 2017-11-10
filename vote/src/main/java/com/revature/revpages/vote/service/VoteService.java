package com.revature.revpages.vote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.revpages.vote.beans.Vote;
import com.revature.revpages.vote.data.VoteRepository;

@Service
public class VoteService { 

	@Autowired
	private VoteRepository voteRepository;

	public void setVoteRepository(VoteRepository voteRepository) {
		this.voteRepository = voteRepository;
	}
	
	public Vote save(Vote vote){
		return voteRepository.save(vote);
	}
	
	public List<Vote> findAll(){
		return voteRepository.findAll();
	}
	
}
