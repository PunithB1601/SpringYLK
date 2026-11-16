package com.dcl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dcl.entity.Student;
import com.dcl.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		StudentRepository repo=context.getBean(StudentRepository.class);
		//System.out.println(repo.getClass().getName());
	
		 
	
		Student s1=new Student();
		s1.setName("Sangamesh");
		s1.setPhone("1234512124");
		s1.setEmail("sangamesh@gmail.com");
		s1.setDateOfBirth(LocalDate.of(2004, 01, 01));
		
		s1=repo.save(s1);
		System.out.println("Data added to DB");
		
   /**
		Student s2=new Student(3, "Basavaraj", "9988776655", "basu@gmail.com", LocalDate.of(2004, 03, 15));
		Student s3=new Student(4,"Chandu","4455445544","chandu@gmail.com",LocalDate.of(2003, 12, 12));
		Student s4=new Student(5,"Brijesh","8866444433","b@gmail.com",LocalDate.of(2003, 02, 02));
		
		repo.saveAll(Arrays.asList(s2,s3,s4));
	
	
		
		/*
		 * Entity save(Entity e);
		 * Iterable<Entity> saveAll(Iterable<Entity>);
		 * 
		 * Optional<Entity> findById(Integer id);
		 * Iterable<Entity> findAllById(Iterable<Integer>);
		 * Boolean existsById(Integer id);
		 * Iterable<Entity> findAll();
		 * Long count();
		 * 
		 * void deleteById(Integer id);
		 * void deleteAllById(Iterable<Integer>);
		 * void deleteAll();
		 * void deleteAll(Iterable<Entity>);
		 */
		
/**		Student s1=repo.findById(1).orElse(null);
		System.out.println(s1);
		
		repo.findAllById(Arrays.asList(1,2,3,4)).forEach(System.out::println);
		
		System.out.println(repo.existsById(1));
		
		repo.findAll().forEach(System.out::println);
		
		System.out.println(repo.count()); 
		
		repo.deleteById(1);
		
		repo.deleteAllById(Arrays.asList(1,2,3));
		
	//	repo.deleteAll(Arrays.asList(repo.findById(4).orElse(null)));
		
		repo.deleteAll();
**/	
	/**	
		Student s=repo.findByEmail("b@gmail.com").orElse(null);
		System.out.println(s);
		
		repo.findByNameStartsWith("B").forEach(System.out::println);
		
		repo.findByStudentIdGreaterThan(2).forEach(System.out::println);
		
		repo.findByPhoneOrEmail("1234567890", "b@gmail.com").forEach(System.out::println);
		**/
		
	}

}
