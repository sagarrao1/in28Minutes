package edurekha.json;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.annotation.JsonFormat;

public class JSONObjectCreateDemo {

	public static void main(String[] args) {
		JSONObjectCreateDemo demo=  new JSONObjectCreateDemo();
		JSONObject jsonObject = demo.createJson();
		demo.displayJson(jsonObject);
	}
	
	private JSONObject createJson() {
		JSONObject studJson= new JSONObject();
		studJson.put("fistname", "Sagar");
		studJson.put("lastname", "Annamaneni");
		studJson.put("email", "sagarrao1@gmail.com");
		studJson.put("marks", 99);
		
		return studJson;
	}
	
	private void displayJson(JSONObject json) {
		System.out.println(json);
	}

}
