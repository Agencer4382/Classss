package com.April11;

public class InstanceVeariables {
	
	private String name="Jhon";//instance can have access modifiers

	public static void main(String[] args) {
		
		String name="Anna";//local can not be static....
		System.out.println(name);
		name="olga";
		System.out.println(name);
		
		InstanceVeariables  obj=new InstanceVeariables ();
		System.out.println(obj.name);
		

	}

}
