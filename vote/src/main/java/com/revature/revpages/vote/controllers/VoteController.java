package com.revature.revpages.vote.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.revpages.vote.beans.Vote;
import com.revature.revpages.vote.service.VoteService;

@RestController
public class VoteController {
	
	@Autowired
	private VoteService voteService;

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}
	
/*	@PutMapping(path="/upvote/", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> upvote(Long postId, Integer userId){
		
	}*/

	@PostMapping(path="/new", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Vote> save(@RequestBody Vote vote){
		return new ResponseEntity<>(voteService.save(vote), HttpStatus.CREATED);
	}
	
	@GetMapping(path="/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vote>> findAll(){
		return new ResponseEntity<>(voteService.findAll(), HttpStatus.OK);
	}
	
	
}
