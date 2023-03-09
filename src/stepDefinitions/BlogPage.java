package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPage {

	
WebDriver driver ;
	
	@Given("user is in Blog page")
	public void navigateSearchPage() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
	}
	
	
	@When("user enters data in search field")
	public void enterProducts() {
		System.out.println("we r in when section");
		driver.findElement(By.name("q")).sendKeys("hello");
	}
	
	@Then("data should appear in search field")
	public void verifyProduct() {
}
}