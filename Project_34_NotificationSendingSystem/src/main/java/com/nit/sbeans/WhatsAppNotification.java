package com.nit.sbeans;




public class WhatsAppNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
	System.out.println("Sends message via WhatsApp: "+message);

	}

}
