package com.nit.Banks;

public interface Bank {
	
	public double getAmount();
	public void setAmount(double amount);
	public String deposite(double amount);
	public String withdraw(double amount);
	public String toString();

}
