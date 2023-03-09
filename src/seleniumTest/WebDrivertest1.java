package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDrivertest1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.id("ta1")).sendKeys("selenium");
		driver.findElement(By.id("radio1")).click();
		driver.findElement(By.id("checkbox2")).click();
		Select s=new Select(driver.findElement(By.id("drop1")));
		s.selectByVisibleText("doc 2");
		String text=driver.findElement(By.id("textbox1")).getAttribute("value");
		
	}
}
