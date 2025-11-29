package javaPracticeArraysMD;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows for the array");
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
		
		int sum = 0;
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println("Summ of elements in an array is " + sum);
		
		sc.close();
		
	}

}
