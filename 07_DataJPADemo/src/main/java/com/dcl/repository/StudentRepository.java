package com.dcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	
	
}
