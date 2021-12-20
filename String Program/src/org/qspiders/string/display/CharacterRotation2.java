package org.qspiders.string.display;

import java.util.Scanner;

public class CharacterRotation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		char ch[] = str.toCharArray();
		for (int i = 0; i <= ch.length-1; i++) {
			int index = i;
			for (int j = 0; j < ch.length; j++) {
				System.out.print(ch[index]);
				index++;
				index %= str.length();
			}
			System.out.println();
		}
		sc.close();
	}

}
