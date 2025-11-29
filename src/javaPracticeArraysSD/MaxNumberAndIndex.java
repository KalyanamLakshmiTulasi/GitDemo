package javaPracticeArraysSD;

import java.util.Scanner;

public class MaxNumberAndIndex {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		int l = sc.nextInt();
		int arr[] = new int[l];
		
		System.out.println("Enter the values to be stored in array");
		for(int i=0; i<l; i++) {
			arr[i] = sc.nextInt();
		}

		int maxNo = arr[0];
		int maxIndex = 0;
		
		for(int i=1;i<l;i++) {
			if(maxNo<arr[i]) {
				maxNo = arr[i];
				maxIndex = i;
			}
		}
		
		System.out.println("The max number from the array is " + maxNo + " and it's index is " + maxIndex);
		
		sc.close();
	}
}