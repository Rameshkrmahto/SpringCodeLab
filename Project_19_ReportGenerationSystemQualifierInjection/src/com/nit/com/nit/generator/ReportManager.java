package com.nit.com.nit.generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.service.ReportServiceInterface;

@Component("rm")
public class ReportManager {
	
	ReportServiceInterface reportService;

	@Autowired
	
	public ReportManager(@Qualifier("excel") ReportServiceInterface reportService) {
		
		this.reportService = reportService;
	}
	
	public void reportDisplay()
	{
		reportService.reportService();
	}
	
	

}
