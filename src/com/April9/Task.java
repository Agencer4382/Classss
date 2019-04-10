package com.April9;

public class Task {
	
	String createEmail(String name, String lastName, String emailType) {
		return name+lastName+"@"+emailType+".com";
		
	}

	public static void main(String[] args) {
		Task obj = new Task();
		System.out.println(obj.createEmail("Koln", "Gelen", "gmail").toLowerCase());
		

	}

}
