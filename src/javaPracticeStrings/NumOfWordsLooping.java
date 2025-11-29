package javaPracticeStrings;

import java.util.Scanner;

public class NumOfWordsLooping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char a[] = s.toCharArray();

		int count = 0;
		int l = s.length();
		
		for (int i=0;i<l;i++) {
			if (Character.isWhitespace(a[i])) {
				count += 1;
			}
		}
		
		System.out.println("The number of words in a string is " + (count));

		sc.close();
		
	}

}
