package edurekha.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	public static void main(String[] args) {
		File file = new File("src\\main\\resources\\empInfo.txt");
		PrintWriterDemo demo = new PrintWriterDemo();
		demo.writeToFile(file);
		
		demo.fileToRead(file);

	}

	private void writeToFile(File file) {
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(file);
			printWriter.println("Sagar");
			printWriter.println("100");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			printWriter.close();
		}

	}
	
	private void fileToRead(File file) {
		try {
			Scanner fileReader= new Scanner(file);
			while(fileReader.hasNext()) {
				System.out.println("Line read from input file :" +fileReader.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
