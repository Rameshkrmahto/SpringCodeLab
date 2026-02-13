package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.ExamResultProcessor;

public class Dependency_Test_05_ExamResultProcessor {

	public static void main(String[] args) {
		
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/config/applicationContext.xml");
		
		ExamResultProcessor examResultProcessor =(ExamResultProcessor)ctx.getBean("examProcesser");
		
		System.out.println("Tatol Marks : "+examResultProcessor.calculateTotal());
		System.out.println("Average Marks : "+examResultProcessor.calcualteAverage());
		ctx.close();
	}

}
