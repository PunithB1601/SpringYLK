package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("district")
@Primary
public class District implements TicketBooking {

	public District() {
		System.out.println("District con");
	}
	
	@Override
	public void reserveTicket() {
		System.out.println("Ticket Reserved by District");
	}

}
