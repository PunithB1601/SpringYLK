package com.dcl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class Student {

	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String course;
	
}
