package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Profile;
import com.revature.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@PostMapping("/saveProfile")
	public ResponseEntity<Profile> saveProfile(@RequestBody Profile profile) {
		profileService.updateProfile(profile);
		return new ResponseEntity<Profile>(HttpStatus.OK);
	}
	
	@PostMapping("/getProfile")
	public ResponseEntity<Profile> getProfile(@RequestBody Profile profile) {
		profileService.getUserProfile(profile);
		return new ResponseEntity<Profile>(profile, HttpStatus.OK);
	}
}
