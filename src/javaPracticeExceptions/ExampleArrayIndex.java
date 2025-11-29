package javaPracticeExceptions;

import java.util.Scanner;

public class ExampleArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of matrix");
		int l = sc.nextInt();
		int arr[] = new int[l];
		
		try {
			for(int i=0;i<=l;i++)
				arr[i] = sc.nextInt();
		}
		catch (ArrayIndexOutOfBoundsException iob) {
			System.out.println(iob);
		}
		
		sc.close();
		
	}

}
