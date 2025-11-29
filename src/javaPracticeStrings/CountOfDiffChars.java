package javaPracticeStrings;

import java.util.Scanner;

public class CountOfDiffChars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();

		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (char ch : s.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("Uppercase letters: " + upperCaseCount);
		System.out.println("Lowercase letters: " + lowerCaseCount);
		System.out.println("Digits: " + digitCount);
		System.out.println("Special characters: " + specialCharCount);

		sc.close();
		
	}
}
