package com.free;

import java.util.Scanner;

public class BoyGirlNm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String fname, mname, gender, childName;
		System.out.println("enter f name");
		fname = sc.next();
		System.out.println("enter m name");
		mname = sc.next();
		System.out.println("enter gender");
		gender = sc.next();

		System.out.println(fname.substring(0, 3) + mname.substring(0, 2));

	}

}
