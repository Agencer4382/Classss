package com.taskerd;

import java.util.Scanner;

public class ItemPayment {

	public static void main(String[] args) {
		String mont;
		int debt=0;
		int montlPay=0;
		int ttl=0;
		int left=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total debt: ");
		debt=sc.nextInt();
		
		while(debt>ttl) {
			System.out.println("Enter mont: ");
			mont=sc.next();
			System.out.println("Enter this mount payment : ");
			montlPay=sc.nextInt();
			ttl+=montlPay;
			
			if (debt==ttl) {
				System.out.println("Your payment is done. ");
				
			}else if(ttl<debt) {
				System.out.println("How much left for next mount: "+(debt-ttl));
			}else {
				System.out.println("Take your rest of the money: "+(ttl-debt));
			}
		}
	}
}


