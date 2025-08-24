package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return service.getUser(id);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable String id) {
		service.deleteUser(id);
	}

}
