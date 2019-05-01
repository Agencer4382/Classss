package com.April20;

public class SuperWithConstructor {
 SuperWithConstructor() {
	System.out.println("I am aparent class constructor");
}
 SuperWithConstructor(String str) {
		System.out.println("I am aparent class constructor with 1 parameters");
	}
 
}
class ChildOfSuperWithConstructor extends SuperWithConstructor{
	 ChildOfSuperWithConstructor() {
		//super();--->complier added by default
		 super("hello");
		System.out.println("I am child class constructor");
	}
}
