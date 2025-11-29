package javaPracticeFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDeletion {

	public static void main(String[] args) throws IOException {

		File f  = new File("D:\\TulasiJavaPractice\\TestText.txt");

		try {
			if(f.createNewFile()) {
				System.out.println("New file is created successfully");
				FileWriter fw = new FileWriter(f);
				fw.write("Written successfully in new file");
				fw.close();
			}
			else {
				f.delete();
				f.createNewFile();
				System.out.println("Existing file is deleted and new file is created");
				FileWriter fw = new FileWriter(f);
				if(f.canWrite()) {
					fw.write("Written successfully in new file after deletion");
				}
				fw.close();
			}
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
