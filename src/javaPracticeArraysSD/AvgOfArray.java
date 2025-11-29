package javaPracticeArraysSD;

import java.util.Scanner;

public class AvgOfArray {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the length of array");
			int l = sc.nextInt();
			
			int arr[] = new int[l];
			int total = 0;
			
			System.out.println("Enter the elements of array");
			for (int i=0;i<l;i++) {
				arr[i] = sc.nextInt();
				total = total+arr[i];
				}
			
			System.out.println("The average of elemnets of array is " + (total/l));
			
			sc.close();
		}
	}

