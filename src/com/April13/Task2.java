package com.April13;

public class Task2 {
	public String name;
	public double gradeA, gradeB, gradeC;

	public Task2(String name, double gradeA, double gradeB, double gradeC) {
		super();
		this.name = name;
		this.gradeA = gradeA;
		this.gradeB = gradeB;
		this.gradeC = gradeC;
	}

	public double average() {
		return (gradeA + gradeB + gradeC) / 3;

	}

	public static void main(String[] args) {
		Task2 obj = new Task2("Ali", 50, 70, 90);
		System.out.print(obj.name + " : " + obj.average());

		Task2 obj1 = new Task2("Mark", 50, 60, 90);
		System.out.print(obj1.name + " : " + obj.average());

		Task2 obj2 = new Task2("Mala", 50, 70, 80);
		System.out.print(obj2.name + " : " + obj.average());

	}

}
