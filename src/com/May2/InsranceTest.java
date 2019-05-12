package com.May2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsranceTest {

	public static void main(String[] args) {
		Insurance obj= new Car("Geico","Volvo" );
		Insurance obj1=new Pet("Progresivve", "Dog");
	    Insurance obj2=new Health("AAA","Dental");
		
	List<Insurance>list= new ArrayList<>();
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).insuranceName);
			
		}
		for(Insurance ins:list) {
			ins.getQuote();
			
		}
		for(Insurance ins:list) {
			ins.cancelInsurance();
		}

		
	}

}
