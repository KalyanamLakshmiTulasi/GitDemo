package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Seventeen DK.txt");
		Scanner sc = new Scanner(f);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the word to be searched in the file");
		String word = sc1.nextLine();

		int wordCount = 0;

		while (sc.hasNextLine()) {

			String line = sc.nextLine();
			String[] words = line.split("\\s+");

			for (String i: words) {
				i = i.replaceAll("[^a-zA-Z]", "");
				if (i.equalsIgnoreCase(word))
					wordCount++;
			}
		}

		System.out.println("The given word is occured " + wordCount + " times");

		sc.close();
		sc1.close();

	}

}
