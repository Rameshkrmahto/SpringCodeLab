package com.nit.service;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PDFReportService implements ReportServiceInterface {

	@Override
	public void reportService() {

        System.out.println("PDFReportService: From PDF");
		
	}
	
	

}
