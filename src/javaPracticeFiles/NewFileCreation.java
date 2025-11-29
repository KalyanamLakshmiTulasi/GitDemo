package javaPracticeFiles;

import java.io.File;
import java.io.IOException;

public class NewFileCreation {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\TulasiJavaPractice\\Resume.txt");

		try {
			if (f.createNewFile()) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
