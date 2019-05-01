package com.Yalcin;

public class Encapsulation {
	private String name;
	private int age;
	private int idNum;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.isEmpty())
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=18) {
		this.age = age;
	}
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
}
