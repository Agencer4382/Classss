package com.May12;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		//System.out.println(a/b);
		
		// if person is >18-->issue dr licence else -->throw an exception
		//checkAge(17);
		//twoNumDiv(10, 0);
		checkNameLength("A");

	}
	public static void checkAge(int age) {
		
		if(age>18) {
			System.out.println("Congratilations on your driver license");
		}else {
			throw new ArithmeticException("You are not eligible to get driver license");
		}
	}
	public static void twoNumDiv(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else{
			
		}throw new ArithmeticException("We cannot divide by zero.");
	}
	public static void checkNameLength(String userName) {
		if(userName.length()>3) {
			System.out.println("User name accepted");
		}else {
			throw new NullPointerException("User name must be longer than 3 characters.");
		}
	}

}
