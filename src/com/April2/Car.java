package com.April2;

public class Car {

	private String make, model, color;
	int year, mph;
	
	public Car(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		
	}
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = 2015;
	}

	public static void main(String[] args) {

		Car car1 = new Car("Honda", "civic", "Black");
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Black";
		car1.year = 2015;
		car1.mph = 120;

		System.out.println("Car make = " + car1.make + "\nCar year = " + car1.year + "\nCar model = " + car1.model
				+ "\nCar color = " + car1.color + "\nCar mph = " + car1.mph);
		
		
		car1.drive();
		car1.stop();
		System.out.println("When I got the hard break mph = "+car1.mph(70));

	}

	void drive() {
		System.out.println(make+" can drive " );
	}

	int mph(int x ) {
		
		return x-50;
	}

	void stop() {
		System.out.println(make+" can stop");
	}

	public String getColor() {
		return color;
	}


}
