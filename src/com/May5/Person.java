package com.May5;

public class Person {
	public String name;
	public String lastName;
	public int age;
	public int salary;
	public Person(String name, String lastName, int age, int salary) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public void userDetails() {
		System.out.println("Name "+name+" Last name "+lastName+" Age is "+age+" salary is "+salary);
	}
	
	

}
