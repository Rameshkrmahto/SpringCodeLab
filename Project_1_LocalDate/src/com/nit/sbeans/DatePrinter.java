package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatePrinter {
	
	private LocalDate dates;
	
	
	
	public void setDates(LocalDate dates) {
		this.dates = dates;
	}

	public void getDate()
	{
		DayOfWeek dayOfWeek = dates.getDayOfWeek();
		System.out.println(dayOfWeek);
		
	}
	

}
