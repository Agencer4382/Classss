package com.April27;

public class Car {
	double regularPrice;
	String color;

	public int calculateSalePrice(int regularPrice) {
		this.regularPrice = regularPrice;
		return regularPrice;
	}

}

class Sedan extends Car {
	int length;

	public double calculateSalePrice(int lenght,double regularPrice) {
		this.length=lenght;
		this.regularPrice=regularPrice;
		if (length > 20) {
			return regularPrice * 0.95;
		} else {
			return regularPrice * 0.90;
		}

	}

}

class Truck extends Car {
	int weight;

	public double calculateSalePrice(int weight, double regularPrice) {
		this.weight=weight;
		this.regularPrice=regularPrice;
		if (weight > 2000) {

			return regularPrice * 0.90;
		} else {
			return regularPrice * 0.80;
		}
	}
}
