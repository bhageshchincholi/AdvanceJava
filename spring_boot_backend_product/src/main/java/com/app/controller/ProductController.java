package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiRepsone;
import com.app.entities.Product;
import com.app.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	public ProductController()
	{
		
	}
	
	@GetMapping
	public List<Product> listAllProduct()
	{
		return service.getAllProduct();
	}
	
	@PostMapping
	public ResponseEntity<?> addProduct(Product product)
	{
		try
		{
			
			return ResponseEntity.status(HttpStatus.CREATED).body(service.addProduct(product));
		}catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiRepsone(e.getMessage()));
		}
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<?> deleteProductById(@PathVariable Long productId)
	{
		try
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.displayDetailsById(productId));
		}catch (RuntimeException e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiRepsone("Invalid id !!"));
		}
	}
}
