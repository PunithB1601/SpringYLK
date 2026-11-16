package com.dcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Product;

@Repository        //Engine
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
