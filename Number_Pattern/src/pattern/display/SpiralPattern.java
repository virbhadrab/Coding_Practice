package pattern.display;

import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the matrix row value");
		int	m = sc.nextInt();
		
		System.out.println("Enetr the matrix col value");
		int n = sc.nextInt();
		
		int arr[][] = new int[m][n];
		
		System.out.println("Enetr the matrix elements");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Your matrix is :-");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int dir = 0, top = 0, down = m-1, left = 0, right = n-1;
		/*dir = 0 means left to right
		  dir = 1 means top to down
		  dir = 2 means right to left
		  dir = 3 means down to top	
		*/System.out.println("**************************");
		while (top<= down && left<= right) {
			if (dir==0) {
				for (int i = left; i <= right ; ++i) {
					System.out.print(arr[top][i]+" ");
					
				}
				++top;
				System.out.println();
			}
			else if (dir==1) {
				for (int i = top; i <= down; ++i) {
					System.out.print(arr[i][right]+" ");
				}
				--right;
				System.out.println();
			}
			else if (dir==2) {
				for (int i = right; i >= left; --i) {
					System.out.print(arr[down][i]+" ");
				}
				--down;
				System.out.println();
			}
			else if (dir==3) {
				for (int i = down; i >= top; --i) {
					System.out.print(arr[i][left]+" ");
				}
				++left;
				System.out.println();
			}
			dir = (dir+1)%4;
		}
		sc.close();
	}

}
