package com.Yalcin;

public class Student {
	String name;
	String surname;
	int birthYear=1990;
private double gpa;
	boolean isPassed;
	
	
Student(){
	this.name="";
	this.surname="";
	this.gpa=2.0;
	this.isPassed=true;
	
}
Student(int birthYear){
	this.birthYear=birthYear;
	this.name="";
	this.surname="";
	this.gpa=2.0;
	this.isPassed=true;
	
}
static int objectCount() {
	return 5;
	
}
Student(String name, String surname){
	this.name=name;
	this.surname=surname;
	this.gpa=2.0;
	this.isPassed=true;
}
String getFullName() {
	String fullName=name+" "+surname;
	return fullName;
}
int getAge(int currentYear) {
	int age=currentYear-birthYear;
	return age;
}
double getGpa() {
	return gpa;
}
void setGpa(double gpa) {
	this.gpa=gpa;
}
void setPassed(boolean isPassed) {
	this.isPassed=isPassed;
	
}
void writeFullDescription() {
	System.out.println("Student "+name+" "+surname+" with birth year "+birthYear+" with gpa "+gpa+" is passed "+isPassed);
}
}
