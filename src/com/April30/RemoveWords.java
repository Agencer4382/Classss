package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveWords {

	public static void main(String[] args) {
		ArrayList<String>word= new ArrayList<>();
		word.add("Apple");
		word.add("Orange");
		word.add("Banana");
		Iterator<String>it=word.iterator();
		while(it.hasNext()) {
		
			if(it.next().endsWith("e")) {
				it.remove();
			}
			
		}
		System.out.println(word);
	}

}
