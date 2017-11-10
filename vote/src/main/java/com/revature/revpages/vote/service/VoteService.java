package com.revature.revpages.vote.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.revpages.vote.beans.Vote;
import com.revature.revpages.vote.data.VoteRepository;

@Service
public class VoteService { 
	
	private static final Logger log = Logger.getLogger(VoteService.class);

	@Autowired
	private VoteRepository voteRepository;

	public void setVoteRepository(VoteRepository voteRepository) {
		this.voteRepository = voteRepository;
	}
	
	public Vote save(Vote vote){
		List<Vote> votes = voteRepository.findByPostId(vote.getPostId());
		for(Vote check : votes){
			if(check.getUserId() == vote.getUserId()){
				log.debug("User has already voted on this");
				vote.setId(check.getId());
				return voteRepository.save(vote);
			}
		}
		return voteRepository.save(vote);
	}
	
	public List<Vote> findAll(){
		return voteRepository.findAll();
	}
	
}
