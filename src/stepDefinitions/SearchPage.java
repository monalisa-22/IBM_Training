package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage {
	WebDriver driver ;
	
	@Given("Test multiple scenario case1")
	public void case1() {
		System.out.println("run case1");
	}
	@Given("Test multiple scenario case2")
	public void case2() {
		System.out.println("run case1");	
	}
	
	
//	@Given("user open website home page")
//	public void setupPage() {
//		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("http://tutorialsninja.com/demo/");	
//	}
	
	@Given("user is in search page")
	public void navigateSearchPage() {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.navigate().to("http://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@When("user enters {string} products")
	public void enterProducts(String product) {
		System.out.println("we r in when section");
		driver.findElement(By.xpath("//input[@type='text'][@name='search']")).sendKeys(product);
	}
	
	@And("Click on search button")
	public void clickSearch() {
		System.out.println("we r in search section");
		driver.findElement(By.xpath("//button[@type='button']//i[@class='fa fa-search']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		//wait.until(ExpectedConditions")));
	}
	
	@Then("Product {string} should be displayed")
	public void verifyProduct(String pProduct) {
		System.out.println("we r in then section");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[text()='"+pProduct+"']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		String actText=pProduct;
		String expText=driver.findElement(By.xpath("//a[text()='"+pProduct+"']")).getText();
		System.out.println(expText);
		assertEquals(expText, actText);
		driver.quit();
	}
	
	
}
