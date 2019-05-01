package com.April25;

public class VehicleTest {

	public static void main(String[] args) {
		Car obj= new BMW("bmw");
		obj.drive();
		obj.start();
		obj.stop();
		Vehicle.displayTotalVehicle();
		//System.out.println(Vehicle.vehicleCount);
		new BMW("X5");
		new Toyota("Camry");
		Vehicle.displayTotalVehicle();
		//System.out.println(Vehicle.vehicleCount);
		
	}

}
