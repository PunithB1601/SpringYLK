package com.dcl;

public class Car {

	private Engine engine;
	
	public Car() {
		System.out.println("0-param-car con");
	}
	
	public Car(Engine engine) {
		this.engine=engine;
		System.out.println("param-car con");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("setter() called");
	}

	void move() {
		engine.start();
	}
}
