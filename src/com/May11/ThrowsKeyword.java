package com.May11;

public class ThrowsKeyword {
	
	public static String name;
	

	public static void main(String[] args) {
		sleepMode();

	}
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping ");
		Thread.sleep(3000);
		System.out.println("Give some coffe");
	}
	public static void allStudent() throws InterruptedException {
		studentSleeping();
	}
	public static void sleepMode() {
		try {
			allStudent();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

}
