package javaPracticeStrings;

import java.util.Scanner;

public class ModifyTheString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();

		String arr[] = s.trim().split("\\s+");
		int l = arr.length;

		String revWord = "";
		String newArr[] = new String[l];

		for (int i=0;i<l;i++) {
			revWord = "";
			if (i%2==0) {
				newArr[i] = arr[i].toUpperCase();
			}
			else {
				for (int j = arr[i].length()-1;j>=0;j--)
				{
					revWord += arr[i].charAt(j);
				}
				newArr[i] = revWord;
			}
		}
		System.out.println("Reverse of each words in string is " + String.join(" ",newArr));
		sc.close();
	}

}
