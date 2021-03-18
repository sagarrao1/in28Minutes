package edurekha.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONOFileCreateDemo {

	public static void main(String[] args) {
		JSONOFileCreateDemo demo = new JSONOFileCreateDemo();
		JSONObject jsonObject = demo.createJson();
		demo.displayJson(jsonObject);
		
		demo.writeToFile(jsonObject, "src\\main\\resources\\students.json");
		demo.readJsonFromFile("src\\main\\resources\\students2.json");
	}

	private JSONObject createJson() {
		JSONObject studJson = new JSONObject();
		studJson.put("firstname", "Sagar");
		studJson.put("lastname", "Annamaneni");
		studJson.put("email", "sagarrao1@gmail.com");
		studJson.put("marks", 99);

		return studJson;
	}

	private void displayJson(JSONObject json) {
		System.out.println(json);
	}

	private void writeToFile(JSONObject json, String fileName) {

		try {
			FileWriter jWriter = new FileWriter(fileName);
			jWriter.write(json.toJSONString());
			jWriter.flush();
			jWriter.close();
			
			System.out.println("Json file created");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	private void readJsonFromFile(String fileName) {
		JSONParser jParser= new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject) jParser.parse(new FileReader(fileName));
			System.out.println();
			System.out.println("JSON OBJECT read from json file");
			System.out.println("=====================================");
			System.out.println(jsonObject.toJSONString());
			
			System.out.println("firstname :" +jsonObject.get("firstname"));
			System.out.println("lastname :" +jsonObject.get("lastname"));
			
			
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

}
