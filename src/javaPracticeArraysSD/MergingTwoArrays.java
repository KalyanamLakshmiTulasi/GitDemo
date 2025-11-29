
package javaPracticeArraysSD;

import java.util.Arrays;
import java.util.Scanner;

public class MergingTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the length of first array");
		int l1 = sc.nextInt();
		String arr1[] = new String[l1];
		
		System.out.println("Enter the values to be stored in array 1");
		for(int i=0; i<l1; i++) {
			arr1[i] = sc.next();
		}
		
		System.out.println("Enter the length of second array");
		int l2 = sc.nextInt();
		String arr2[] = new String[l2];
		
		System.out.println("Enter the values to be stored in array 2");
		for(int i=0; i<l2; i++) {
			arr2[i] = sc.next();
		}

		int finalLength = l1+l2;
		String arr3[] = new String[finalLength];
		
		for (int i=0; i<l1; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int j=0;j<l2;j++) {
			arr3[j+l1] = arr2[j]; 
		}
		
		System.out.println("The merged array is "+Arrays.toString(arr3));
		
		sc.close();
		}
}
