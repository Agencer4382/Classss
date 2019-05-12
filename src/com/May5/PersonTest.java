package com.May5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		Map<Integer,Person> perMap=new HashMap<>();
		perMap.put(1001, new Person("Kevin","Pakeny",35,70000));
		perMap.put(1002, new Person("Colin","Rose",55,90000));
		perMap.put(1003, new Person("James","Smith",57,97000));
		
//		Collection<Person>perValues=perMap.values();
		for(Person person:perMap.values()) {
			person.userDetails();
			
		}
	}

}
