package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.PlayerService;

public class PlayerApp {
    public static void main(String[] args) {
       
    	AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
    	PlayerService player1= ctx.getBean(PlayerService.class);
    	
    	player1.displayPlayerInfo();
    	ctx.close();
    	
    }
}
