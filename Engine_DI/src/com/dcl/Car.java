package com.dcl;

public class Car{
	
	Engine engine;
	
	public Car() {
		
	}
	
	//Param-constructor
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	void move() {
		engine.start();
		System.out.println("Car is moving");
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
		System.out.println("setter() called");
	}
	
}
