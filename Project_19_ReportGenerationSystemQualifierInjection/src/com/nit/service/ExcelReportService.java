package com.nit.service;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReportService implements ReportServiceInterface {

	@Override
	public void reportService() {

        System.out.println("ExcelReportService: From Excel");
		
	}

}
