package javaPracticeFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Answer5 {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("D:\\TulasiJavaPractice\\SVT Intro.txt");
		File f2 = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Seventeen DK.txt");
		File merged = new File("D:\\TulasiJavaPractice\\hyrJavaPractice\\Merged File.txt");
		
		FileWriter fw = new FileWriter(merged);
		
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNextLine()) {
			fw.write(sc1.nextLine()+ "\n");
		}
		
		Scanner sc2 = new Scanner(f2);
		while(sc2.hasNextLine()) {
			fw.write(sc2.nextLine()+ "\n");
		}
		
		System.out.println("The files have been merged into a new file");
		Scanner sc3 = new Scanner(merged);
		while(sc3.hasNextLine()) {
			System.out.println(sc3.nextLine());
		}
		
		sc1.close();
		sc2.close();
		sc3.close();
		fw.close();

	}

}
