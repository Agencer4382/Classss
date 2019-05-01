package com.April20;

public class Employee {
	String name, lastName;

	Employee() {
		System.out.println("I am a parent class contructor");
	}

	public Employee(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
}

class Tester extends Employee {
	int salary;

	public Tester(String name, String lastName, int salary) {
		super(name, lastName);
		this.salary = salary;
	}

	public void disPlayDet() {
		System.out.println("Employe " + name + " " + lastName + " has a salary of " + salary);
	}
}
