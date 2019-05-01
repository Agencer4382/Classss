package com.April25;

public abstract class Vehicle {
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;
	}
	//public static abstract void gps(); can not have abstract methods as s static(cannot override)
	//private abstract void speed (); can not have abstract methods as a private (do not part of inheritance)
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by press break");
	}
	public static void displayTotalVehicle() {
		System.out.println("Total vehicles we build "+vehicleCount);
	}

}
abstract class Car extends Vehicle{
	public String make;
	Car(String make){
		this.make=make;
	}
	
}
class BMW extends Car{

	BMW(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("BMW car starts remote");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
		
	}
	
}
class Toyota extends Car{
	

	Toyota(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Toyota car starts push button");
		
		
	}

	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");
		
	}
	
}
