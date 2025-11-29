package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("D:\\TulasiJavaPractice\\SVT Intro.txt");

		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("File is not found " + e.getMessage());
		}

	}

}
