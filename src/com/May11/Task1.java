package com.May11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			int num= sc.nextInt();
			System.out.println(num);
		}catch(InputMismatchException e) {
			System.out.println("wrong match");
		}
	}

}
