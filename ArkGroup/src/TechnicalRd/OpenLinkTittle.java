package TechnicalRd;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkTittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.google.com/");

		String handle = d.getWindowHandle();
		System.out.println(handle);
		System.out.println(d.getTitle());

		Set<String> handl = d.getWindowHandles();
		Iterator<String> it = handl.iterator();
		it.hasNext();

		it.next();
		System.out.println(d.getTitle());

		System.out.println(it.hasNext());

	}
}
