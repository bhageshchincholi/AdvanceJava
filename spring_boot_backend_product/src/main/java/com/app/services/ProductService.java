package com.app.services;

import java.util.List;

import com.app.dto.ApiRepsone;
import com.app.entities.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	Product addProduct(Product product);
	ApiRepsone displayDetailsById(Long productId);
}
