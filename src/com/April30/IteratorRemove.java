package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new ArrayList<>();
		for(int i=1; i<=10; i++) {
			alist.add(i);
		}
		System.out.println(alist);
		
		Iterator<Integer>iterator=alist.iterator();
		while(iterator.hasNext()) {
			
			if(iterator.next()%2!=0) {
				iterator.remove();
			}
			
		}
		System.out.println(alist);
		
	}

}
