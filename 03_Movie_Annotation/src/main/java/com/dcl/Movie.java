package com.dcl;

import org.springframework.stereotype.Component;

//Target
@Component
public class Movie {

	private TicketBooking booking;
	
	public Movie() {
		System.out.println("Movie 0-param-con");
	}
	
	public Movie(TicketBooking booking) {
		this.booking=booking;
		System.out.println("param-con-Movie");
	}
	
	
	void watch() {
		booking.reserveTicket();
		System.out.println("Tickets verifed, show started");
	}
}
