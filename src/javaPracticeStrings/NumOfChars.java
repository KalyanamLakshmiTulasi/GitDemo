package javaPracticeStrings;

import java.util.Scanner;

public class NumOfChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		
		System.out.println("Number of characters in the string is " + l);
		
		sc.close();
	}

}
