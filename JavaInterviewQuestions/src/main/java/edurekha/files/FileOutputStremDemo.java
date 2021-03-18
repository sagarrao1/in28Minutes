package edurekha.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStremDemo {

	public static void main(String[] args) {
		File file = new File("src\\main\\resources\\fileStream.txt");
		FileOutputStremDemo demo =  new FileOutputStremDemo();
		demo.writeToFile(file);

	}
	
	private void writeToFile(File file) {		
			FileOutputStream fileWriter;
			try {
				fileWriter = new FileOutputStream(file);
				fileWriter.write("Hello this is writing to file using fileOutputStream class".getBytes());
				fileWriter.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
}
