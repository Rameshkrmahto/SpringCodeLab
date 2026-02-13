package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.AccountBalanceManager;
import com.nit.sbeans.TransactionService;

public class BankkTransactionMain {
    public static void main(String[] args) {
        
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	AccountBalanceManager acc1 = ctx.getBean("acc",AccountBalanceManager.class);
    	acc1.updateBalance(50000);
    	
    TransactionService t1 = ctx.getBean("ts",TransactionService.class);
    t1.processTransaction("deposite", 120000);
    	ctx.close();
    
    	
    }
}
