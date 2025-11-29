package javaPracticeArraysSD;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int l = sc.nextInt();
		String arr[] = new String[l];

		System.out.println("Enter the values to be stored in array");
		for(int i=0; i<l; i++) {
			arr[i] = sc.next();
		}
		
		String rev[] = new String[l];
		
		for(int i=0;i<l;i++)
		{
			rev[i] = arr[l-i-1];
		}
		
		System.out.println("The reversed array is " + Arrays.toString(rev));
		
		sc.close();
	}

}
