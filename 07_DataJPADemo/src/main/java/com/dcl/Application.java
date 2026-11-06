package com.dcl;

import java.time.LocalDate;
import java.util.Arrays;

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
	
	/**	
		Student s1=new Student();
		s1.setStudentId(2);
		s1.setName("Sangamesh");
		s1.setPhone("1234512123");
		s1.setEmail("sangu@gmail.com");
		s1.setDateOfBirth(LocalDate.of(2004, 01, 01));
		
		s1=repo.save(s1);
		System.out.println("Data added to DB");
		
    **/
		Student s2=new Student(3, "Basavaraj", "9988776655", "basu@gmail.com", LocalDate.of(2004, 03, 15));
		Student s3=new Student(4,"Chandu","4455445544","chandu@gmail.com",LocalDate.of(2003, 12, 12));
		Student s4=new Student(5,"Brijesh","8866444433","b@gmail.com",LocalDate.of(2003, 02, 02));
		
		repo.saveAll(Arrays.asList(s2,s3,s4));
		
	}

}
