package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	List<User> getAll();
	User getUser(Long id);
	User createUser(User user);
	Boolean userExists(Long id);
}
