package com.April14;

public class Child1 extends Parent {

	String hairType = "Curly";

	public static void main(String[] args) {

		Child1 obj = new Child1();
		System.out.println("Child 1 eye color " + obj.eyeColor);
		System.out.println("Child 1 hair color " + obj.hairColor);
		System.out.println("Child 1 hiar type "+obj.hairType);
		obj.playTennis();
		obj.sing();

	}
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}

}
