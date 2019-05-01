package com.April28;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
	ArrayList<String> arrlist=new ArrayList();
		
		arrlist.add("hi");
		arrlist.add("yo");
		arrlist.add("sup");
		arrlist.add("yolo");
		arrlist.add("boop");
		
				for(int i=0;i<arrlist.size();i++) {
			arrlist.remove(i);
		}
		
		for (String object : arrlist) {
			System.out.print(object+", ");
		}
	}
	
	  
	

}
