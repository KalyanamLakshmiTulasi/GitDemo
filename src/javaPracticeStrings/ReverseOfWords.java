package javaPracticeStrings;

import java.util.Scanner;

public class ReverseOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		String arr[] = s.trim().split("\\s+");
		int l = arr.length;
		
		String revWord = "";
		String revArr[] = new String[l];
		
		for (int i=0;i<l;i++) {
			for (int j = arr[i].length()-1;j>=0;j--)
			{
				revWord += arr[i].charAt(j);
			}
			revArr[i] = revWord;
			revWord = "";
		}
		System.out.println("Reverse of each words in string is " + String.join(" ", revArr));
		sc.close();
	}

}
