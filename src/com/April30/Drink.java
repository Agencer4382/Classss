package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class Drink {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Cola");
		list.add("IceTea");
		list.add("Su");
		
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			String words=it.next();
			if(words.contains("a")||words.contains("e")) {
				it.remove();
	
			}
			
		}
		System.out.println(list);

	}

}
