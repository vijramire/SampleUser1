package com.user.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.main.pojo.UserPojo;
import com.user.main.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
		
	public UserPojo addUsers(UserPojo userPojo) {
		return userRepo.save(userPojo);
		
	} 
	public List<UserPojo> findAll() {
		return userRepo.findAll();
		
	} 
	
	public Optional<UserPojo> findById(Integer id) {
		return userRepo.findById(id);

	}
	  
}
