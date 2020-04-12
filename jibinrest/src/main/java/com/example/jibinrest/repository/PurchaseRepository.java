package com.example.jibinrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jibinrest.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{

}
