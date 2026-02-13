package com.nit.sbeans;




public class SMSNotification implements NotificationStrategy{

	@Override
	public void send(String message) {

        System.out.println("Sends message via SMS: "+message);
		
	}

}
