package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		int[] array = { 10, 10, 20, 20 };

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(12);// 2 get. comes from collection
		numbers.add(0, 13);// 1 get. specific to all List object
		numbers.add(0, 14);// 0 get.
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));

		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));// boolean T/F

		System.out.println("----------ForLoop---------");
		for (int num : numbers) {// for loop
			System.out.println(num);

		}
		System.out.println("----------ITERATOR---------");
		Iterator<Integer> it = numbers.iterator();
		// hasNext(); next(); remove();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// while loop
		System.out.println("----------While Loop---------");
		int c = 0;
		while (numbers.size() > c) {
			System.out.println(numbers.get(c));
			c++;
		}

	}

}
