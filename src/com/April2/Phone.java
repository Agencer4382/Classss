package com.April2;

public class Phone {

	String model, color, os;
	int size, screen;

	public static void main(String[] args) {

		Phone phone = new Phone();

		phone.model = "Samsung";
		phone.color = "red";
		phone.os = "android";
		phone.size = 32;
		phone.screen = 5;

		phone.makecall();
		phone.search();
		phone.takePicture();

		Phone phone2 = new Phone();

		phone2.model = "Iphone";
		phone2.color = "Black";
		phone2.screen = 6;
		phone2.os = "IOS";
		phone2.size = 8;

		phone2.makecall();
		phone2.search();
		phone2.takePicture();

		Phone phone3 = new Phone();

		phone3.model = "Nokia";
		phone3.color = "Red";
		phone3.screen = 4;
		phone3.os = "Windows";
		phone3.size = 6;

		phone3.makecall();
		phone3.search();
		phone3.takePicture();

	}

	void makecall() {
		System.out.println("You can make call with the " + model);
	}

	void search() {
		System.out.println("People search web with the  " + model);

	}

	void takePicture() {
		System.out.println("You can take picture with the " + model);
	}

}
