package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipKart {
	public WebDriver driver;

	// Before is used as Hooks
	// We can set the priority for Hooks also using order
	// Execution order for Before will be 0,1
	@Before(value = "@flipkart", order = 0)
	public void intialiaze_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Scenario Execution Started");

	}

	@Before(value = "@flipkart", order = 1)
	// Before is used as Hooks
	// We can set the priority for Hooks also using order
	// Execution order for Before will be 0,1

	public void maximize_browser() {
		System.out.println("Maximizing the Browser");
		driver.manage().window().maximize();
	}

	@Given("^user navigate to website$")
	public void user_navigate_to_website() {

		driver.get("https://www.flipkart.com");

	}

	@When("^user click on Search field$")
	public void user_click_on_Search_field() {
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();

	}

	@And("^search any (.+)$")
	public void search_any(String product) {
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(product);
		WebElement searchtextfield = driver
				.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchtextfield.sendKeys(Keys.ENTER);
	}

	// After is used as Hooks
	// We can set the priority for Hooks also using order
	// Execution order for Before will be 1,0
	@After(value = "@flipkart", order = 1)
	public void CloseBrowser() {
		System.out.println("closing the Browser");
		driver.quit();

	}

	// After is used as Hooks
	// We can set the priority for Hooks also using order
	// Execution order for Before will be 1,0
	@After(value = "@flipkart", order = 0)
	public void testcaseverification() {

		System.out.println("Scenario Execution Completed");
	}

	@Then("^Get the count of product$")
	public void get_the_count_of_product() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));

		System.out.println("Product SIZE is:" + " " + product.size());
	}

	@Given("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to_something(String strArg1) throws InterruptedException {

		driver.get(strArg1);
		Thread.sleep(2000);
	}

	@When("^user search product$")
	public void user_search_product() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Furniture");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Before("@amazon")
	public void amozon_before_hook() {
		System.out.println("Amazon Before");
	}

	@After("@amazon")
	public void amozon_after_hook() {
		System.out.println("Amazon After");
	}
}
