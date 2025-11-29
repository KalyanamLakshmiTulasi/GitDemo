package javaPracticeFiles;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\TulasiJavaPractice\\SVT Intro.txt");

		int asciiCode;
		String text = new String();

		while((asciiCode = fr.read())!= -1) {
			text += String.valueOf((char)asciiCode);
		}
		System.out.println(text);
		fr.close();
	}

}
