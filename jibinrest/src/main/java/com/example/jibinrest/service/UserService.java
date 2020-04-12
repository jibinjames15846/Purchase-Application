package com.example.jibinrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jibinrest.model.User;
import com.example.jibinrest.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> listAll() {
		return userRepository.findAll();
	}

	public void save(User user) {
		userRepository.save(user);

	}

	public User get(Integer id) {
		return userRepository.findById(id).get();
	}

	public void delete(Integer id) {
		userRepository.deleteById(id);
	}

}
