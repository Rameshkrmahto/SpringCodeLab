package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.EmailNotification;
import com.nit.sbeans.NotificationStrategy;
import com.nit.sbeans.SMSNotification;
import com.nit.sbeans.WhatsAppNotification;
import com.nit.service.NotificationService;

@SpringBootApplication
public class Project34NotificationSendingSystemApplication {


	@Bean(name = "email")
	   public EmailNotification getEmail()
		{
			return new EmailNotification();
		}
	    
	    @Bean(name="sms")
	    public SMSNotification getSend()
	    {
	    	return new SMSNotification();
	    }
	    
	    @Bean(name="whatsapp")
	    public WhatsAppNotification getWhatsAppNotification()
	    {
	    	return new WhatsAppNotification();
	    }
		


	public static void main(String[] args) {
		
		
		
		
		AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication.run(Project34NotificationSendingSystemApplication.class, args);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Sending From");
		String msg=sc.next();
		
		NotificationStrategy sender= (NotificationStrategy)ctx.getBean(msg);
		
		
		
		NotificationService notification = ctx.getBean(NotificationService.class);
		
		
		
		
		notification.setNotificationStrategy(sender);
		System.out.println("Enter your Message");
		sc.next();
		String message=sc.nextLine();
		notification.notifyUser(message);
		
		ctx.close();
		sc.close();
		
		
		
	}

}
