package com.dcl;

import org.springframework.stereotype.Component;

@Component("demo")
public class PVR implements TicketBooking {

	public PVR() {
		System.out.println("pvr con");
	}
	
	@Override
	public void reserveTicket() {
		System.out.println("PVR ticket booked");
	}

}
