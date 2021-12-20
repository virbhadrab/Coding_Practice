package org.jspiders.mp.display;

public class Pattern7 {

	public static void main(String[] args) {
		int lines = 5;
		int starCount = 1;
		int spaceCount = 4;
		System.out.println("Program Started");
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=spaceCount; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=starCount; k++) {
				if (k==1 || k==starCount) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			spaceCount--;
			starCount+=2;
		}
		System.out.println("Program Ended...");

	}

}
