package com.dcl;

public class Test {

	public static void main(String[] args) {
		//Engine e=new Diesel();
		Car c=new Car();
		//c.setEngine(e);
		c.engine=new Petrol();
		c.move();
	}
}
