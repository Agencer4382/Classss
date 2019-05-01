package com.April28;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerNameList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kevin");
		names.add("John");
		names.add("Daren");
		names.add("Jeck");
		names.add("Cloin");
		names.add(0, "Smith");
	names.remove(3);

		System.out.println(names.get(3));
		System.out.println("List is empty : " + names.isEmpty());
		System.out.println("List is contain Kevin : " + names.contains("Kevin"));
		System.out.println("Size of array list : " + names.size());

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("-------");   // this way same as for
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

	}
}
