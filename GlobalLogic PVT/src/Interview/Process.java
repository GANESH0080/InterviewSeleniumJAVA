package Interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Process {

	public static void main(String[] args) {

		String cityList = "Mumbai,Delhi,Kolkata,Delhi,Mumbai,Kolkata,Banglore,delhi";
		String[] chars = cityList.split(",");
		Set<String> uniqueChars = new LinkedHashSet<>();
		for (String s : chars) {
			uniqueChars.add(s);
		}
		// System.out.println(uniqueChars);
		Stream.of(chars).distinct().forEach(s -> System.out.print(s + " "));
	}
}
