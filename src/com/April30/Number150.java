package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class Number150 {

	public static void main(String[] args) {
		ArrayList<Integer>list= new ArrayList<>();
		for (int i=0; i<=50; i+=2) {
			list.add(i);
		}
		Iterator<Integer>iterator=list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()%5==0) {
				iterator.remove();
				
			}
		}
		System.out.println(list);
	}
}
