package com.April14;

public class Employee {
	public static String department="IT";
	public int salary;
	protected int salary1;
	
	public void getPaid() {
		System.out.println("Employee get salary "+salary);
	}
	public static void work () {
		System.out.println("Employee works "+department+" department");
	}
	protected void doSome() {
		System.out.println("Im a protected");
	}
	

}
