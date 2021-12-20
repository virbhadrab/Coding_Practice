package org.jspiders.patterns.display;

public class Patter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 5;
		int charCount = 1;
		char value = 'A';
		
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=charCount; j++) {
				System.out.print(value);
			}
			System.out.println();
			value++;
			charCount++;
		}
	}

}
