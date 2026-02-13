package com.nit.sbeans;

public class ExamResultProcessor {
	
	SubjectMarks subjectMarks;

	public ExamResultProcessor(SubjectMarks subjectMarks) {
		super();
		this.subjectMarks = subjectMarks;
	}
	
	public int calculateTotal()
	{
		return (subjectMarks.maths+subjectMarks.science+subjectMarks.socialScience);
	}
	
	public double calcualteAverage()
	{
		return (calculateTotal()/3);
	}

}
