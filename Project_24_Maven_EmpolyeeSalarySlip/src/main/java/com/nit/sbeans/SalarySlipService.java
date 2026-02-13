package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("salary")
public class SalarySlipService {
	
	@Autowired
	Employee employee;
	
	public void generateSlip()
	{
		double grossSalary=employee.basicSalary+employee.hra+employee.da;
		
		double taxAmount=(grossSalary*employee.taxPercentage)/100.0;
		 double netSalary=grossSalary-taxAmount;
		 
		 System.out.println("Salary: "+netSalary);
	}

}
