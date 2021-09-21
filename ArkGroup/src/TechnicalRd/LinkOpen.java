package TechnicalRd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOpen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		// Open new blank TAB:
		((JavascriptExecutor) d).executeScript("window.open()");

		Thread.sleep(2000);
		// Open new TAB with specific URL:
		((JavascriptExecutor) d).executeScript("window.open('https://google.com')");

		Thread.sleep(2000);
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		

	}

}
