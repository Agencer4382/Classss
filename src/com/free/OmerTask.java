package com.free;

import java.util.Scanner;

public class OmerTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String spin, beep;

		System.out.println("doesnt spin");
		spin = sc.nextLine();
		System.out.println("does it beep");
		beep = sc.nextLine();

		if (spin.contentEquals("y") && beep.contentEquals("y")) {
			System.out.println("Contact tech support");

		}
		if (spin.contentEquals("y") && beep.contentEquals("n")) {
			System.out.println("check the speaker");
		}
		if (spin.contentEquals("n") && beep.contentEquals("y")) {
			System.out.println("check drive contact");

		}
		if (spin.contentEquals("n") && beep.contentEquals("n")) {
System.out.println("bring the computer to repair");
		}
		
	}

}
