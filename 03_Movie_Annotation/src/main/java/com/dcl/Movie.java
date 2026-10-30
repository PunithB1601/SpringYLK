package com.dcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Target
@Component
public class Movie {

	
	private TicketBooking booking;
	
	public Movie() {
		System.out.println("Movie 0-param-con");
	}
	
	@Autowired
	public Movie(TicketBooking booking) {
		this.booking=booking;
		System.out.println("param-con-Movie");
	}
	
	
	public void setBooking(TicketBooking booking) {
		this.booking=booking;
		System.out.println("setter() called");
	}
	
	
	void watch() {
		booking.reserveTicket();
		System.out.println("Tickets verifed, show started");
	}
}
