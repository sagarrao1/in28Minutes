package edurekha.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStremDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("src\\main\\resources\\serializeFile.txt");
		ObjectOutputStremDemo demo =  new ObjectOutputStremDemo();
		
		VehicleInfo v1= new VehicleInfo("XUV300", "Mahindra",21.0);
		VehicleInfo v2= new VehicleInfo("Sonet", "Kia",24.0);
		
		demo.serializeToFile(file, v1);
//		demo.serializeToFile(file, v2);
		System.out.println("serialized file created");
	}
	
	private void serializeToFile(File file , VehicleInfo vehicleObj) throws IOException {		
		FileOutputStream fileStream= new FileOutputStream(file);
		ObjectOutputStream objStream=  new ObjectOutputStream(fileStream);
		objStream.writeObject(vehicleObj);
		objStream.flush();
		objStream.close();	
		
		}
			
}
