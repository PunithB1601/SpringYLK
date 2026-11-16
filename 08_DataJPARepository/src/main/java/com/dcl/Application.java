package com.dcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dcl.entity.Product;
import com.dcl.service.impl.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	ProductServiceImpl service=context.getBean(ProductServiceImpl.class);
	
		Product alreadyExists=service.getProductById(3);
		alreadyExists.setPrice(10.0);
		service.updateProduct(alreadyExists.getProductId(), alreadyExists);
	}

}
