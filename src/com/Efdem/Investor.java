package com.Efdem;

public class Investor {
	
	public static void main (String []args) {
		Company ford=new Company("Ford motors", 100000);
		//ford.setName("Ford motors");
		//ford.setCapital(100000);
		
		System.out.println(ford.getName());
		
		ford.sell(5000);
		System.out.println("First income total = "+ford.getIncomeTtl());
		
		ford.sell(3000);
		System.out.println("Second income total = "+ford.getIncomeTtl());
		
		ford.invest(15000);
		System.out.println("After invest income total = "+ford.getIncomeTtl());
		
		ford.buy(4000);
		System.out.println(ford.getCapital());
	}

}
