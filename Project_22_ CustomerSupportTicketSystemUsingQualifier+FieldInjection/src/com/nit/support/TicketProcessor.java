package com.nit.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.service.SupportService;

@Component("tp")
public class TicketProcessor {
	
	@Autowired
	@Qualifier("level1")
	SupportService supportService;
	
	public void ticketInfo()
	{
		supportService.handleTicket();
	}

}
