package TechnicalRd;

public class FindKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String keywords = "selenium,python,java,testing,tutorial";
		String str = "\"Selenium is the first thing that comes to mind when one is planning to automate the testing of web applications. \"\r\n"
				+ "+ \"Selenium is a beneficial tool because it is not only open source but also a portable software testing framework for \"\r\n"
				+ "+ \"web applications that support multiple languages like Java, C#, Ruby, Python. Choosing the right language depends on \"\r\n"
				+ "+ \"the application under test, the supporting community, available test automation frameworks, usability, elegance, \"\r\n"
				+ "+ \"and of course, seamless build integration.";

	

		String[] stringarray = keywords.split(",");
		for (int i = 0; i < stringarray.length; i++) {

			if (str.toLowerCase().contains(stringarray[i])) {
				System.out.println("The word" + " " + stringarray[i] + " " + "avaialble in para");
			} else
				System.out.println("The word" + " " + stringarray[i] + " " + "not avaialble in para");

		}

	}

}
