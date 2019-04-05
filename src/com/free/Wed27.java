package com.free;

public class Wed27 {

	public static void main(String[] args) {

		String rev = "Thisisgithub";

		if (!(rev.isEmpty())) {

			if (rev.length() % 2 != 0 && rev.length() >= 3) {

				int len = rev.length();
				int charPos = len / 2;
				char myChar = rev.charAt(charPos);
				String myChar2 = rev.substring(charPos, charPos + 1);

				System.out.println(myChar);

			}

			else {
				System.out.println("Your string length is either less than 3, or even!!!");
			}
		} else {
			System.out.println("Your string is empty!!!");
		}

	}
}
