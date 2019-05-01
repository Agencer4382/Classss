package com.April16;

public class Parent {
	public int parentCount() {
		return 0;

	}

	public void love() {
		System.out.println("parents love");

	}

	public void work() {
		System.out.println("parents work");
	}

	public void cry() {
		System.out.println("parents cry");
	}

}

class Child1 extends Parent {
	public int parentCount() {
		return super.parentCount() + 1;

	}

	public void love() {
		super.love();
		System.out.println("child1 love");
	}

	public void cry() {
		System.out.println("child1 cry");
	}

}

class Child2 extends Child1 {

	public int parentCount() {

		return super.parentCount() + 1;

	}

	public void work() {
		System.out.println("child2 work");
	}

	public void cry() {
		System.out.println("child2 cry");
	}

	public void prinParentCount() {
		System.out.println("Parent count = " + parentCount());
	}
}
