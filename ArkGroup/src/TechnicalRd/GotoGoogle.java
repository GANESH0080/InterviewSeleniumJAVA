package TechnicalRd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GotoGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement searchfield = d.findElement(By.xpath("//input[@name='q']"));
		searchfield.sendKeys("Selenium Ttutorial");

		searchfield.sendKeys(Keys.ENTER);
		System.out.println(d.getTitle());

		assertTrue(d.getTitle().contains("Selenium Ttutorial - Google Search"));

	}

}
