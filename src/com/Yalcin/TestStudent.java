package com.Yalcin;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1=new Student();
		System.out.println("Student name is : "+student1.name);
		System.out.println("Studetn surname is : "+student1.surname);
		System.out.println("Student gpa is : "+student1.getGpa());
		
		
		student1.setGpa(3.5);
		System.out.println("Student gpa is : "+student1.getGpa());
		student1.name="ali";
		student1.surname="kel";
		System.out.println("Student full name is : "+student1.getFullName());
		student1.writeFullDescription();
		
		Student student2=new Student("veli","kala");
		System.out.println("Student name is : "+student2.name);
		System.out.println("Studetn surname is : "+student2.surname);
		System.out.println("Student gpa is : "+student2.getGpa());
		
		System.out.println(student1.objectCount());//static olmayan birsey obje ile cagirilmak zorunda.
		System.out.println(Student.objectCount());//static bir fonksiyonu hic obje olusturmadan calss name ile cagirablirsnz.

	}

}
