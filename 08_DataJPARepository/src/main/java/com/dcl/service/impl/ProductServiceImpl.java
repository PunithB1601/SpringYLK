package com.dcl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.repository.ProductRepository;
import com.dcl.service.ProductService;

@Service        
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository prepo;
	
	@Override     
	public void insertProduct(Product p) {
		
		prepo.save(p);
		
	}

	@Override
	public void updateProduct(Integer productId, Product p) {
		Product alreadyExists=prepo.findById(productId).orElse(null);
		if(alreadyExists.getProductId()==p.getProductId()) {
			prepo.save(p);
		}
		
	}

	@Override
	public void deleteProduct(Integer productId) {
		prepo.deleteById(productId);
		
	}

	@Override
	public Product getProductById(Integer productId) {
		return prepo.findById(productId).orElse(null);
	}

	@Override
	public List<Product> getAllProduct() {
		return prepo.findAll();
	}

}
