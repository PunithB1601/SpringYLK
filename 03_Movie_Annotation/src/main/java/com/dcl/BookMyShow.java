package com.dcl;

import org.springframework.stereotype.Component;

@Component
public class BookMyShow implements TicketBooking {

	public BookMyShow() {
		System.out.println("BMS con");
	}
	
	@Override
	public void reserveTicket() {
		System.out.println("Ticker reserved from BookMyShow!");
	}

}
