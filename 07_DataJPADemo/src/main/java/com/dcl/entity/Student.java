package com.dcl.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_app")
public class Student {

	@Id
	@Column(name="s_id")
	private Integer studentId;  //student_id
	
	private String name;
	
	@Column(unique = true, nullable = false)
	private String phone;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	private LocalDate dateOfBirth; //date_of_birth
}
