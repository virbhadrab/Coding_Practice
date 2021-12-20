package org.jspiders.mp.display;

public class Pattern3 {

	public static void main(String[] args) {
		int lines = 5;
		int starCount = 1;
		int spaceCount = 4;
		int mid = (lines+1)/2;
		System.out.println("Program Started");
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=starCount; j++) {
				if (j==1 || j==starCount) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int k = 1; k <=spaceCount; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <=starCount; l++) {
				if (l==1 || l==starCount) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i<mid) {
				starCount++;
				spaceCount -=2;
			} else {
				spaceCount += 2;
				starCount--;
			}
		}
		System.out.println("Program Ended...");

	}

}
