package javaPracticeFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Answer6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Seventeen DK.txt");
		Scanner sc = new Scanner(f);
		
		String text = "";
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			text += line.toUpperCase() + "\n";
			}
		
		System.out.println("The text is converted into uppercase\n" + text);
		
		sc.close();
	}

}
