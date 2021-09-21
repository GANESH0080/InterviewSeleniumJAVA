import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class CreateJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		//Creating a JSONObject object
		JSONObject jsonObject = new JSONObject();
		
		//Insert the required key-value pairs using the put() method of the JSONObject class.
		jsonObject.put("ID", "Ganesh");
		jsonObject.put("NAME", "Bhumi");
		jsonObject.put("LName", "Khalate");
		jsonObject.put("Address", "Kalamboli");
		jsonObject.put("DOB", "1 Jan 2021");
		//Write the created JSON object into a file using the FileWriter class as −
		FileWriter file = new FileWriter("D:\\SeleniumWorkspace\\TechMahidra\\output.json");
		file.write(jsonObject.toJSONString());
		file.close();

	}

}
