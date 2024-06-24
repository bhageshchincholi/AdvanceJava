package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ProductDao;
import com.app.dto.ApiRepsone;
import com.app.entities.Product;
import com.app.exceptions.SourceNotFoundException;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productdao;
	@Override
	public List<Product> getAllProduct() {
		
		return productdao.findAll() ;
	}
	
	
	@Override
	public Product addProduct(Product product) {
	
		Product product1 = productdao.save(product);
		return product1;
	}


	@Override
	public ApiRepsone displayDetailsById(Long productId) {
		
		if(productdao.existsById(productId))
		{
			productdao.findById(productId);
			
			return new ApiRepsone("Product details !!");
		}
		return  new ApiRepsone("Product detailes failed !!");	
	}
	
	
	
	
}
