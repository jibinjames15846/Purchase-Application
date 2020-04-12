package com.example.jibinrest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jibinrest.model.Product;
import com.example.jibinrest.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> list() {
		return productService.listAll();
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id) {

			Product product = productService.get(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		

	}

	@PostMapping("/products")
	public void add(@RequestBody Product product) {
		productService.save(product);
	}

	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id)

	{
		try {
			Product existProduct = productService.get(id);
			productService.save(product);
			return new ResponseEntity<Product>(product, HttpStatus.OK);

		}

		catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(product, HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("products/{id}")
	public void delete(Integer id) {
		productService.delete(id);
	}

}
