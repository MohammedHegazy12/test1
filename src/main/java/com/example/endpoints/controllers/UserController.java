package com.example.endpoints.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.endpoints.Exception.UserNoFoundException;
import com.example.endpoints.entities.User;
import com.example.endpoints.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("")
	public Iterable<User>GetAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable int id) {
		User user=userService.findById(id);
		 
		return user;
	}
	@PostMapping("")
	public void postMapping(@RequestBody User user) {
			userService.addUser(user);
	}
}
