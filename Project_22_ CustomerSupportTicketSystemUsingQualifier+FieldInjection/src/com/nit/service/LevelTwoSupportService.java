package com.nit.service;

import org.springframework.stereotype.Component;

@Component("level2")
public class LevelTwoSupportService implements SupportService{

	@Override
	public void handleTicket() {


		System.out.println("LevelTwoSupportService.handleTicket()");
		
	}

}
