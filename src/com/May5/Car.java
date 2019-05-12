package com.May5;

public class Car {
	public String model;
	public String make;
	public Car(String make, String model) {
		super();
		this.model = model;
		this.make = make;
	}
	public void printCarDetails() {
		System.out.println("Make is "+make+" Model is "+model);
	}

}
