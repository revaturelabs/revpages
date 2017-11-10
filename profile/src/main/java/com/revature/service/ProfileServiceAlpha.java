package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Profile;
import com.revature.respository.ProfileRepository;

@Service("profileService")
public class ProfileServiceAlpha implements ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public void updateProfile(Profile profile) {
		profileRepository.save(profile);
	}

	@Override
	public Profile getUserProfile(Profile profile) {
		return profileRepository.getByUserId(profile.getUserId());
	}
}
