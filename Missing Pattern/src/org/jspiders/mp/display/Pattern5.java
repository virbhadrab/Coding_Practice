package org.jspiders.mp.display;

public class Pattern5 {

	public static void main(String[] args) {
		int lines = 5;
		int starCount = 9;
		int spaceCount = 0;
		System.out.println("Program Started");
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=spaceCount; j++) {
				System.out.print(" ");
			}
			for (int l = 1; l <=starCount; l++) {
				if (i==1 || l==1 || l==starCount) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			starCount -=2;
			spaceCount++;
			}
		System.out.println("Program Ended...");

	}

}
