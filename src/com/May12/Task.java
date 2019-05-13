package com.May12;

public class Task {

	public static void main(String[] args) {
		getMoney(500, 400);
	

	}
	public static void getMoney(int amount, int balance) {
		
	
		if(balance>amount) {
			System.out.println("Get your money");
		}else {
			throw new ArithmeticException("Please check your balance");
		}
	}
}
