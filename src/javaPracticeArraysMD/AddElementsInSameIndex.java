package javaPracticeArraysMD;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementsInSameIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of multi dimentional arrays required");
		int arrCount = sc.nextInt();

		for(int a=0;a<arrCount;a++) {

			System.out.println("Enter the number of rows for the array "+ a);
			int r = sc.nextInt();
			int arr[][] = new int[r][];

			for(int i=0;i<r;i++) {
				System.out.println("Enter the number of columns for row " + i);
				int c = sc.nextInt();
				arr[i] = new int[c];

				for (int j=0;j<c;j++) {
					System.out.println("Enter the elements for row " + i +" and column " + j);
					arr[i][j] = sc.nextInt();
				}
			}

			for(int i=0;i<r;i++) {
				System.out.println(Arrays.toString(arr[i]));
			}

		}
		
		int addArray[][] = new int[2][];
	}

}
