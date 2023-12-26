package com.example.endpoints.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.endpoints.Exception.UserNoFoundException;
import com.example.endpoints.entities.User;
import com.example.endpoints.repositories.UserRepository;

@Service
public class UserService {
 
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public Iterable<User>findAll(){
		return userRepository.findAll();
	}
	
	public User findById(int id) {
		return userRepository.findById(id).orElseThrow(()->new UserNoFoundException("Invalid User"));
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
}
