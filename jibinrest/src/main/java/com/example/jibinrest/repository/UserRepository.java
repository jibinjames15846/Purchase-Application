package com.example.jibinrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jibinrest.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
