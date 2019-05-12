package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer>numbers= new ArrayList<>();
		for(int i=0; i<=20; i++) {
			numbers.add(i);
		}
		Iterator<Integer>it= numbers.iterator();
		while(it.hasNext()) {
			if (it.next()%2!=1) {
				it.remove();
				
			}
		}
		System.out.println(numbers);
	}

}
