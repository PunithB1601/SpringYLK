package com.dcl;

public class DebitCard implements Payment {

	public DebitCard() {
		System.out.println("DebitCard obj");
	}
	
	@Override
	public void makePayment() {
		System.out.println("Payment done by Debit Card");
	}

}
