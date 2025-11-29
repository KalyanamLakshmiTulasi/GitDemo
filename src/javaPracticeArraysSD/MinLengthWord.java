package javaPracticeArraysSD;

import java.util.Scanner;

public class MinLengthWord {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int l = sc.nextInt();
		String arr[] = new String[l];

		System.out.println("Enter the values to be stored in array");
		for(int i=0; i<l; i++) {
			arr[i] = sc.next();
		}
		
		int minLength = arr[0].length();
		int minIndex = 0;
		
		for (int i=1;i<l;i++) {
			if(minLength>arr[i].length()) {
				minIndex = i;
			}
		}
		
		System.out.println("The word with minimum length in array is " + arr[minIndex] + " and the index is " + minIndex);
		
		sc.close();

	}

}
