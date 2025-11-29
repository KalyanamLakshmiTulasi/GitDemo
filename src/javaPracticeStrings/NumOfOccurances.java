package javaPracticeStrings;

import java.util.Scanner;

public class NumOfOccurances {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		System.out.println("Enter a character to find it's occurances");
		char c = sc.next().trim().charAt(0);
		
		int l = s.length();
		int count = 0;
		
		for(int i=0;i<l;i++) {
			if (arr[i]==c) {
				count += 1;
			}
		}
		
		System.out.println("The character " + c + " occurs " + count + " times in the entered string");
		sc.close();
	}
	

}
