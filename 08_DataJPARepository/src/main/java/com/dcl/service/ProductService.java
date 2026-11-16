package com.dcl.service;

import java.util.List;

import com.dcl.entity.Product;


public interface ProductService {

	void insertProduct(Product p);
	
	void updateProduct(Integer productId, Product p);
	
	void deleteProduct(Integer productId);
	
	Product getProductById(Integer productId);
	
	List<Product> getAllProduct();
}
