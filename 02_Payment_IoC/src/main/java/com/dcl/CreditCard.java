package com.dcl;

public class CreditCard implements Payment {

	public CreditCard() {
		System.out.println("CreditCard obj");
	}
	
	
	@Override
	public void makePayment() {
		System.out.println("Payment done by Credit Card");
	}

}
