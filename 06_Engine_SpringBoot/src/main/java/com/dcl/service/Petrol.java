package com.dcl.service;

import org.springframework.stereotype.Component;

@Component("petrol")
public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol con");
	}
	
	@Override
	public void start() {
		System.out.println("Petrol eng started!");
	}

}
