package com.dcl;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.dcl.entity.Product;
import com.dcl.repository.ProductRepository;
import com.dcl.service.impl.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	ProductServiceImpl service=context.getBean(ProductServiceImpl.class);
				
	ProductRepository repo=context.getBean(ProductRepository.class);
		
	//Sorting
			Sort s=Sort.by("productName").ascending();
		//	repo.findAll(s).forEach(System.out::println);
			
	//Pagination
		/**	Integer pageNum=0;
			do {
			System.out.println("Enter the page Num");
			pageNum=sc.nextInt();
			PageRequest req=PageRequest.of(pageNum-1, 4,s);
			repo.findAll(req).forEach(System.out::println);
			}while(pageNum>0&&pageNum<7);
	**/	
			
		//QueryByExample
			Product p=new Product();
			p.setBrand("Apple");
			p.setPrice(10000.0);
			Example<Product> qbe=Example.of(p);
			repo.findAll(qbe).forEach(System.out::println);
	
	}

}
