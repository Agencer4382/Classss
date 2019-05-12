package com.April30;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		Student s1= new Student("John", 101);
		Student s2= new Student("Kevin", 102);
		Student s3= new Student("Jack", 103);
		Student s4= new Student("Jelly", 104);
		
		ArrayList<Student>alist=new ArrayList();
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		System.out.println("---------FORLOOP----------");
		for(Student object:alist) {
			object.printStudentDetails();
			//System.out.println(object.name);
		}
		System.out.println("------------ITERATOR------");
		Iterator<Student>it=alist.iterator();
		while(it.hasNext()) {
			Student obj=it.next();
			obj.printStudentDetails();
			
		}
		

	}

}
