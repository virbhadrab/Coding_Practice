package org.jspiders.mp.display;

public class Pattern1 {

	public static void main(String[] args) {
		int line = 5;
		int starCount = 1;
		int spaceCount = 2;
		int mid =(line + 1)/2;
		System.out.println("Program Started");
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <=spaceCount; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=starCount; k++) {
				if (k==1||k==starCount) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i<mid) {
				starCount = starCount + 2;
				spaceCount--;
			} else {
				starCount = starCount - 2;
				spaceCount ++;
			}
			
		}
		System.out.println("Program Ended...");

	}

}
