package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Answer2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Seventeen DK.txt");
		Scanner sc = new Scanner(f);
		
		int linesCount = 0;
		int maxLineLength = 0;
		int maxLineNum = 0;
		String line = "";
		
		
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			linesCount++;
			
			if(line.length()>maxLineLength) {
				maxLineLength = line.length();
				maxLineNum = linesCount;
			}
		}
		
		System.out.println("Total number of lines in the document is " + linesCount + " and the lengthy line in the file is " + maxLineNum);
		
		sc.close();
	}

}
