package com.example.jibinrest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jibinrest.model.Product;
import com.example.jibinrest.model.User;
import com.example.jibinrest.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> list() {
		return userService.listAll();
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id) {
		try {
			User user = userService.get(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/user")
	public void add(@RequestBody User user) {
		userService.save(user);
	}

}
