package Action_Item_Second;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Item_6_8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.name("username")).sendKeys("USERNAME");
		driver.findElement(By.name("password")).sendKeys("PASSWORD");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@value=\"cb1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"cb2\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"rd3\"]")).click();
		driver.findElement(By.name("dropdown")).click();
		driver.findElement(By.xpath("//option[@value=\"dd4\"]")).click();
		driver.findElement(By.name("submitbutton")).submit();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
	}

}
