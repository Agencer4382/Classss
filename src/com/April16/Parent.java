package com.April16;

public class Parent {
	public void love() {
		System.out.println("parents love");
		
	}
	public void work() {
		System.out.println("parents work");
	}
	

}
class Child extends Parent {
	public void love() {
		System.out.println("child love");
	}
	public void cry() {
		System.out.println("child cry");
	}
	
	
}
