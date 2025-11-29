package javaPracticeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\TulasiJavaPractice\\SVT Intro.txt");
		FileInputStream fis = new FileInputStream(f);

		int asciiCode;
		String text = new String();
		
		while ((asciiCode = fis.read()) != -1) {
			text += String.valueOf((char)asciiCode);
		}

		System.out.print(text);
		fis.close();
	}

}
