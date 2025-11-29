package javaPracticeStrings;

import java.util.Scanner;

public class NumOfWordsSplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		String a[] = s.trim().split("\\s+");
		System.out.println(a);
		int l = a.length;
		
		System.out.println("The number of words in a string is " + l);

		sc.close();
	}

}
