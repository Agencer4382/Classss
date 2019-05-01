package com.April20;

public class SuperKeyword {
	String name = "John";

	public void sayName() {
		System.out.println("Parent name is " + name);
	}

}

class ChildOfSuperKeyword extends SuperKeyword {
	String name = "Micheal";
	public void sayName() {
		System.out.println("Parent name is " + super.name);
		System.out.println("Child name is " + name);
	}
	public void callingMethods() {
		sayName();
		super.sayName();
	}

}
