package com.dcl;

public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol obj created");
	}
	
	@Override
	public void start() {
		System.out.println("Petrol engine started");
	}

}
