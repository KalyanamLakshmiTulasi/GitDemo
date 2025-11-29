package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Answer3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Seventeen DK.txt");
		Scanner sc = new Scanner(f);
		
		String lines = "";
		int wordCount = 0;
		 
		while (sc.hasNextLine()) {
			lines = sc.nextLine();
			wordCount += lines.split(" ").length;
		}
		
		System.out.println("Total number of words in the document is " + wordCount);
		
		sc.close();

	}

}
