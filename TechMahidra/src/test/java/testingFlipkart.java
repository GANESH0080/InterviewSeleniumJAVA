import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class testingFlipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		d.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobile");
		WebElement searchtextfield = d.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchtextfield.sendKeys(Keys.ENTER);
		
		List <WebElement> product = d.findElements(By.xpath("//div[@class='_2kHMtA']"));
	
		System.out.println("Product SIZE is:" +" " +product.size());
		
		for(WebElement e : product)
		{
			System.out.println(e.getText());
		}
		
	}

}
