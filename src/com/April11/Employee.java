package com.April11;

public class Employee {
	int salary;
	int eID;
	public static String CEO = "Sumir";

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.eID = 1;
		obj.salary = 100;

		Employee obj2 = new Employee();
		obj2.eID = 2;
		obj2.salary = 200;
		
		Employee obj3=new Employee();
		obj3.eID=3;
		obj3.salary=300;
		
		
		obj2.getEmployee();
		obj3.getEmployee();

	}
	void getEmployee() {
		System.out.println("Employee id "+eID+" , salary "+salary+" and CEO "+CEO);
	}
}
