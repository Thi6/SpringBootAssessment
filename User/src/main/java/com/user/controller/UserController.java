package com.user.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.user.entity.User;
import com.user.service.UserService;



@RestController
public class UserController {

	
	private UserService service;
	private RestTemplate restTemplate;
 	
	@Autowired
	public UserController(UserService service, RestTemplate restTemplate) {
		super();
		this.service = service;
		this.restTemplate = restTemplate;
	}
	
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return service.createUser(user);
	}
	
	
	
	@RequestMapping("/check/{id}")
	public Boolean checkUserExists(@PathVariable("id") Long id) {
		return service.userExists(id);
	}
	
	

}
