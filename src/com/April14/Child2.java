package com.April14;

public class Child2 extends Parent {
	
	String hair="Black hair";
	
	
	public static void main(String[] args) {
		Child2 obj = new Child2();
		System.out.println("Child 2 eye color is "+obj.eyeColor);
		System.out.println("Child 2 hair color is "+obj.hair);
		obj.canSing();
		obj.canSwim();
		obj.sing();
	}
	public void canSing() {
		System.out.println("Child 2 can sing");
		
	}
public void canSwim() {
	System.out.println("Child 2 can swim");
}

}
