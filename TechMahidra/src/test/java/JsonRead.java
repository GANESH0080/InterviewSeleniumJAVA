import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// Instantiate the JSONParser class of the json-simple library.
		JSONParser jsonParser = new JSONParser();

		// Parsing the contents of the JSON file
		JSONObject jsonObject = (JSONObject) jsonParser
				.parse(new FileReader("D:\\SeleniumWorkspace\\TechMahidra\\sample2.json"));

		// Retrieve the value associated with a key using the get() method.
		String id = (String) jsonObject.get("ID");
		// Printing the value of ID key
		System.out.println(id);

		String Fname = (String) jsonObject.get("First_Name");
		System.out.println(Fname);

		String Lname = (String) jsonObject.get("Last_Name");
		System.out.println(Lname);

		String DOB = (String) jsonObject.get("Date_Of_Birth");
		System.out.println(DOB);

	}

}
