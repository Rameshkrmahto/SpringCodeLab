package com.nit.service;

import org.springframework.stereotype.Component;

@Component("level1")
public class LevelOneSupportService implements SupportService{

	@Override
	public void handleTicket() {
		System.out.println("LevelOneSupportService.handleTicket()");
		
	}

}
