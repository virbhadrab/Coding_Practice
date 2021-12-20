package org.qspiders.string.display;

import java.util.Scanner;

public class Display_String {

	public static void main(String[] args) {
		System.out.println("Program Started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("---------------1st Output------------------");

		String [] str1  = str.split(" ");

		for (int i = 0; i <= str1.length-1; i++) 
		{
			System.out.print(str1[i]+str1[i].length());
		}

		System.out.println("\n----------------2nd Output--------------------");
		StringBuffer str2 = new StringBuffer(str);
		str2.reverse();
		System.out.println("\t"+str2);

		System.out.println("\n-----------------3rd Output--------------------------");

		for (int i = 0; i <= str1.length-1; i++) {
			if (i==0 || i==str1.length) {
				for (int k = str1[i].length(); k >=0; k--) {
					System.out.print(str1[k]+" ");
				}
			}			
		}

		System.out.println("\n--------------------4th OutPut--------------------");
		String str3[] = new String[str1.length];
		for (int i = 0; i <= str1.length-1; i++) {
			if (i==0) {
				str3[i] = str1[str1.length-1];
			}
			else if (i==str1.length-1) {
				str3[i] = str1[0];
			}
			else {
				str3[i] = str1[i];
			}

		}
		for (int k = 0; k < str3.length; k++) {
			System.out.print(str3[k]);
		}
		System.out.println("\n--------5th output--------");
		for (int i = 0; i <= str3.length-1; i++) {

			if (i==0 || i==str3.length-1) {
				char ch[] = str3[i].toCharArray();

				for (int j = ch.length-1; j >=0; j--) {
					System.out.print(ch[j]); 
				}
				System.out.print(" ");
			}
			else {
				System.out.print(str3[i]+" ");
			}
		}
		System.out.println(" \n\nFifith output");
		for (int i = 0; i < str3.length; i++) {
			
		}
		sc.close();
	}

}