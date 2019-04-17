package com.April16;

public class BankTest {

	public static void main(String[] args) {
		Bank obj=new Bank();
		Bank obj1=new BOA();
		Bank obj2= new PNC();
		System.out.println("Bank charges interest = "+obj.chargeInterest());
		System.out.println("BOA charges interest = "+obj1.chargeInterest());
		System.out.println("PNC charges interest = "+obj2.chargeInterest());
		
		

	}

}
