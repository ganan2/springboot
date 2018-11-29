package com.example.demo.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.User;
import com.example.demo.repos.UserRepos;
import com.example.demo.service.UserService;

@Transactional
public class UserServiceImpl  implements UserService{

	@Autowired
	UserRepos userRepos;
	
	public User createUser(User user) {
		if(user != null & user.getEmail() != null) {
			userRepos.save(user);
		}
		
		return user;
	}
	
	public User updateUser(User user) {
		
		if(user != null & user.getEmail() != null) {
			User localUser = userRepos.findById(user);
			userRepos.save(localUser);
		}
		return user;
	}
	
	public Optional<User> readUser(User user) {
		Optional<User> localUser = null; 
		if(user != null ) {
			localUser = userRepos.findById(user.getId());
		}
		
		return localUser;
	}
	
	public boolean deleteUser(User user) {
		if(user != null) {
			userRepos.delete(user);
		}
		return true;
	}
}
