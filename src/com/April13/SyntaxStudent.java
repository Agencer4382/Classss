package com.April13;

public class SyntaxStudent {
	
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent(String name, String lastName) {
		studentName=name;
		studentLastName=lastName;
		
	}
	
	public void getStudentDetails () {
		String details="I am a student a "+schoolName+" from batch "+batchNumber+" and may name is "+studentName+" last name "+studentLastName;
	System.out.println(details);
	}

}
