package com.dcl.service;

import org.springframework.stereotype.Component;

@Component("diesel")
public class Diesel implements Engine {

	public Diesel() {
		System.out.println("Diesel con");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
