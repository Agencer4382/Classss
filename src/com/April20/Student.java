package com.April20;

public class Student {
	String fullName;
	int age;
	//this is used to differentiate b/w local and instance variables 
	public Student(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age is "+age);
	}
	
	public static void main(String[] args) {
		Student obj =new Student("John Snow",30);
		obj.displayDetails();
	}

}
