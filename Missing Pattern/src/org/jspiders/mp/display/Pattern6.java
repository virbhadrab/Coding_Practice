package org.jspiders.mp.display;

public class Pattern6 {

	public static void main(String[] args) {
		int lines = 5;
		int starCoutn = 9;
		int spaceCount = 0;
		System.out.println("Program Started");
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=spaceCount ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=starCoutn ; k++) {
				if (k==1 || k==starCoutn) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			starCoutn-=2;
			spaceCount++;
		}
		System.out.println("Program Ended...");
	}

}
