package com.example.jibinrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.jibinrest.model.Product;
import com.example.jibinrest.repository.ProductRepository;



@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> listAll()
	{
		return repository.findAll();
		
	}
	
	
	public void save(Product product)
	{
		repository.save(product);
	}

	
	public Product get(Integer id)
	{
		return repository.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		repository.deleteById(id);
	}
}
