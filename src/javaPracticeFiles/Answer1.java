package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Answer1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Seventeen DK.txt");
		Scanner sc = new Scanner(f);
		
		int linesCount = 0;
		while (sc.hasNextLine()) {
			sc.nextLine();
			linesCount++;
		}
		
		System.out.println("Total number of lines in the document is " + linesCount);
		
		sc.close();
	}

}
