package com.user.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.main.pojo.UserPojo;
import com.user.main.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public UserPojo addUsers(@RequestBody UserPojo userPojo) {
		return userService.addUsers(userPojo);
		
	}
	@GetMapping("/getusers")
	public List<UserPojo> findAll() {
		return userService.findAll();
		
	}

	@GetMapping("/{id}")
	public Optional<UserPojo> findById(@PathVariable("id") Integer id) {
		return userService.findById(id);

	}
}
