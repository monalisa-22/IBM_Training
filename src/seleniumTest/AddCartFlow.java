package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCartFlow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
		String price = driver.findElement(By.xpath("//div[@id='content']//h2[contains(text(),'$')]")).getText();
		driver.findElement(By.xpath("//input[@type='text' and @id='input-quantity']")).clear();
		driver.findElement(By.xpath("//input[@type='text' and @id='input-quantity']")).sendKeys("2");
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		boolean b=driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).isDisplayed();
		System.out.println(b+"Displayed");
		driver.findElement(By.xpath("//button[@type='button'][@data-toggle='dropdown']")).click();
		driver.findElement(By.xpath("//p//a[contains(@href,'checkout/cart')]//i")).click();
		String qtnty=driver.findElement(By.xpath("//div[@class='input-group btn-block']")).getAttribute("value");
		driver.findElement(By.xpath("//td[text()='"+price+"']")).isDisplayed();
		System.out.println("Adding");
	}

}
