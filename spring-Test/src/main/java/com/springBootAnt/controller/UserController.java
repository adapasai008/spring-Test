package com.springBootAnt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBootAnt.exception.RecordNotFoundException;
import com.springBootAnt.model.UserEntity;
import com.springBootAnt.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/addusers")
	public UserEntity addUsers(@RequestBody UserEntity users) {
		return service.saveUser(users);
	}

	@GetMapping("/users")
	public List<UserEntity> findAllUsers() {
		return service.getUsers();
	}

	@PutMapping("/users/{userId}")
	public String updateUsers(@RequestBody UserEntity users, @PathVariable Integer userId)
			throws RecordNotFoundException {
		return service.updateUsers(users, userId);

	}

	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		return service.deleteUsers(userId);
	}

	// get by {id}
	@GetMapping("/user/{userId}")
	public Optional<UserEntity> findUser(@PathVariable Integer userId) throws RecordNotFoundException {
		return service.findUser(userId);

	}

}
