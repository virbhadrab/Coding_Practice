package org.qspiders.string.display;

import java.util.Scanner;

public class Strin_Replace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String\n");
		String str = sc.nextLine();
		
		String [] s1 = str.split("s");
		for (int i = 0; i <= s1.length-1; i++) {
			System.out.print(s1[i]);
			if (i!=s1.length-1) {
				System.out.print("$");
			}
		}
		sc.close();
	}

}
