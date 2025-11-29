package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		
		File f = new File("D:\\TulasiJavaPractice\\SVT Introduction.txt");
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found " + e.getMessage());
		}
		
	}

}
