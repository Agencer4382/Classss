package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class Number150 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i <= 50; i += 2) {
			numbers.add(i);

		}
		
		Iterator<Integer> it = numbers.iterator();
		
		while (it.hasNext()) {
          if (it.next() % 5 == 0) {
				it.remove();
			}

		}
		System.out.println(numbers);
	}
}
