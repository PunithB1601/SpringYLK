package com.dcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class Car {

	@Autowired
	@Qualifier("petrol")
	private Engine eng;
	
	public Car() {
		System.out.println("0-param-car-con");
	}
	
	public Car(Engine eng) {
		this.eng=eng;
		System.out.println("param-car-con");
	}
	
	public void setEng(Engine eng) {
		this.eng=eng;
		System.out.println("setter() called");
	}
	
	public void move() {
		eng.start();
		System.out.println("Car started moving");
	}
}
