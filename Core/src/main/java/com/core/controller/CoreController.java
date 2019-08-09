package com.core.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.core.entity.Search;



@RestController
public class CoreController {

	
	
	
	private RestTemplate restTemplate;
	
	
	@Autowired
	public CoreController(RestTemplate restTemplate) {
		
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/search/{search}/{id}")
	public String search(@PathVariable String search, @PathVariable Long id) {
		
		Boolean userExists = restTemplate.getForObject("http://localhost:8080/check/{id}", Boolean.class, id);
		
		if (userExists) {
			String exchangeSearch = restTemplate.getForObject("http://localhost:8079/findByNumber/{search}", String.class, search);
			
			return exchangeSearch;
		} else {
			return "User doesn't exist!";
		}
		
	}
	

	

}
