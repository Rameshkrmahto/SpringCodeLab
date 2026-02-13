package com.nit.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.BankFactory.BankFactory;
import com.nit.Banks.Bank;

//@Component
@Service
public class CustomerClass {

	private int customerId;
	private String customerName;
	private Bank bank;

	@Autowired
	private BankFactory bankFactory;

	public void setCutomerId(int cutomerId) {
		this.customerId = cutomerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setBank(String bankname) {
		this.bank = bankFactory.createBank(bankname);
		
		System.out.println(bank.toString());

	}

	public void deposit(double amount) {
		System.out.println(bank.deposite(amount));
	}
	public void withdraw(double amount) {
		
		System.out.println(bank.withdraw(amount));
	}
	
	public void display()
	{
		System.out.println("Cutomer Id :"+customerId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Balance: "+bank.getAmount());
	}

}
