package pattern.display;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 5;
		int numcount = 1;
		char special = '$';
		int value = 1;
		int mid =(lines+1)/2;
		int spaceCount = 2;
		
		for (int i = 1; i <=lines; i++) {
			for (int j = 1; j <=numcount; j++) {
				if (i%2==0) {
					System.out.print(special);
					
				} else {
					System.out.print(value);
				}
				value++;
			}
			for (int k = 1; k <=spaceCount; k++) {
				System.out.print(" ");
			}
			value = 1;
			for (int n = 1; n <=numcount; n++) {
				if (i%2==0) {
					System.out.print(special);
					
				} else {
					System.out.print(value);
				}
				value++;
			}
			System.out.println();
			value = 1;
			if (i<mid) {
				numcount++;
				spaceCount--;
			}
			else {
				numcount--;
				spaceCount++;
			}
		}

	}

}
