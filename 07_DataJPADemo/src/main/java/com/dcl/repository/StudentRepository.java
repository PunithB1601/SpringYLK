package com.dcl.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Student;
import java.util.List;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	/**
	Optional<Student> findByEmail(String email);
	
	List<Student> findByNameStartsWith(String name);
	
	List<Student> findByStudentIdGreaterThan(Integer id);
	
	List<Student> findByPhoneOrEmail(String phone, String email);
	
	**/
	
	
	
}
