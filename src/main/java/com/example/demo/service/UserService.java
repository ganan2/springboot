package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

@Service
public interface UserService {
	public User createUser(User user);

	public User updateUser(User user);

	public Optional<User> readUser(User user);

	public boolean deleteUser(User user);
}
