package org.qspiders.string.display;

import java.util.Scanner;

public class EqualNumberString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		System.out.println("Enter the how many parts you wants");
		int n = sc.nextInt();
		
		String []equalsStr = new String[n];
		int len = str.length();
		int temp = 0, chars = len/n;
		
		if (len%n!=0) {
			System.out.println("String Can't be devided into "+n+" numbers of parts");
		} else {
			for (int i = 0; i < len; i=i+chars) {
				String part = str.substring(i,i+chars);
				equalsStr[temp] = part;
				temp++;
			}
			System.out.println("Equal number of String Parts are -");
			for (int i = 0; i < equalsStr.length; i++) {
				System.out.println(equalsStr[i]);
			}
		}
		
		sc.close();
	}

}
