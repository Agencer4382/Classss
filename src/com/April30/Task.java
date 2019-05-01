package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		ArrayList<String>cars= new ArrayList<>();
		cars.add("Volvo");
		cars.add("Tesla");
		
		System.out.println(cars.size());
		
		for(Object car:cars) {
			System.out.println(car);
		}
		Iterator<String>it= cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
