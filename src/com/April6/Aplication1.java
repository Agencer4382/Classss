package com.April6;

public class Aplication1 {

	public static void main(String[] args) {
		Aplication1 app = new Aplication1();
	}

	void example() {
		System.out.println("No return value and NO Parameters");
	}

	void example2(String name) {
		System.out.println("No return value but with Parameter : " + name);
	}

	boolean example3() {
		System.out.println("With return value and NO Parameters");
		return true;
	}

	String example4(String name) {
		System.out.println("No return value but with Parameter : " + name);

		return name;
	}

	boolean example5(String name) {
		System.out.println("No return value but with Parameter : " + name);

		return false;
	}

	long example6(char name) {
		System.out.println("No return value but with Parameter : " + name);
		return name;
	}
}
