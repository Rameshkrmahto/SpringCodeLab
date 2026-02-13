package com.nit.sbeans;


public class EmailNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		
		System.out.println("Send message via Email: "+message);
	}

}
