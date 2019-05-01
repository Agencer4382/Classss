package com.Efdem;

public class Task2 {

	String str = "Hello world this group best";
	String[] words = str.split(" ");
	String rev = "";

	void revString() {
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + " ");
		}
	}

	public static void main(String[] args) {
		Task2 str = new Task2();
		str.revString();

	}

}
