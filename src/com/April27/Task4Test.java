package com.April27;

public class Task4Test {

	public static void main(String[] args) {
		Truck obj= new Truck();
		obj.color="red";
		System.out.println("Volvo color is "+obj.color);
		System.out.println("Volvo price is "+obj.calculateSalePrice(1800,55000.00));
		Sedan obj1= new Sedan();
		obj1.color="Grey";
		System.out.println("Tesla color is "+obj1.color);
		System.out.println("Tesla price is "+obj1.calculateSalePrice(18, 30000.00));
		

	}

}
