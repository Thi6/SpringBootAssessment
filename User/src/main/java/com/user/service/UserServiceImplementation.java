package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	

	private UserRepository repo;
	
	@Autowired
	public UserServiceImplementation(UserRepository repo) {
		this.repo = repo;
	}
	
	public List<User> getAll() {
		return repo.findAll();
	}

	
	public User getUser(Long id) {
		return repo.findById(id).orElse(null);
	}

	
	public User createUser(User user) {
		return repo.save(user);
	}

	
	public Boolean userExists(Long id) {
		return repo.existsById(id);
	}
	 
	
	
}
