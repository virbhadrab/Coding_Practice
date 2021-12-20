package org.qspiders.string.display;

import java.util.Scanner;

public class ChracterRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		char ch[] = str.toCharArray();
		
		for (int i = 0; i <= ch.length-1; i++) {
			for (int j = i; j <= ch.length-1; j++) {
				System.out.print(ch[j]);
			}
			for (int k = 0; k < i; k++) {
				System.out.print(ch[k]);
			}
			System.out.println();
		}
		sc.close();
	}

}
