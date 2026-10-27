package com.dcl;

public class BillGenerator {
	
	private Payment payment;
	
	public BillGenerator() {
		System.out.println("0-param-Bill-con");
	}
	
	public BillGenerator(Payment payment) {
		this.payment=payment;
		System.out.println("Bill-con-param");
	}
	
	public void setPayment(Payment payment) {
		this.payment=payment;
		System.out.println("setter() called");
	}
	
	void generateBill() {
		payment.makePayment();
		System.out.println("Bill Generated");
	}
}
