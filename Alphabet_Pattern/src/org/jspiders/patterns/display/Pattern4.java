package org.jspiders.patterns.display;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 5;
		int charCount = 5;
		char value = 'E';
		int mid = (lines+1)/2;
		
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=charCount; j++) {
				if (i==1 || i==mid || j==1 || j==charCount || i==lines) {
					System.out.print(value);
				} else {
					System.out.print(" ");
				}
				value--;
			}
			System.out.println();
			value = 'E';
		}
	}
  
}
