package javaPracticeFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferReaderExample {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\TulasiJavaPractice\\SVT Intro.txt"))) {
			String line;
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
