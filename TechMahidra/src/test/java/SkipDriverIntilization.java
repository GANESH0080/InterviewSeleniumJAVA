import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkipDriverIntilization {

	public static void main(String[] args) throws InterruptedException {
		// No need to write "System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");"
		// Added WebDriverManager dependency in POM file 
		// Simply using below statement we can setup the chrome browser
		// We can setup any browser
		// WebDriverManager.chromedriver().setup(); 
		// WebDriver driver = new Chromedriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(1000);
		searchfield.submit();
		

	}

}
