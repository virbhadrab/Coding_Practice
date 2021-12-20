package org.jspiders.mp.display;

public class Pattern2 {

	public static void main(String[] args) {
		int lines = 5;
		int spaceCount = 2;
		int starCount = 1;
		int mid = (lines+1)/2;
		System.out.println("Program Started");
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=starCount; j++) {
				if (j==1||j==starCount) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int k = 1; k <=spaceCount; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=starCount; j++) {
				if (j==1 || j==starCount) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i<mid) {
				starCount++;
				spaceCount--;
			} else {
				starCount--;
				spaceCount++;
			}
		}
		System.out.println("Program Ended...");
		

	}

}
