package Action_Item_Second;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Item_6_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://theautomationzone.blogspot.com/2022/01/calculator.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Cal3 = driver.findElement(By.xpath("(//tr/td[2]/input)[2]"));
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(RelativeLocator.with(By.xpath("(//tr/td[3]/input)[1]")).toRightOf(Cal3)).click();


		driver.findElement(RelativeLocator.with(By.xpath("(//tr/td)[18]")).below(By.xpath("(//tr/td)[14]"))).click();

		driver.findElement(RelativeLocator.with(By.xpath("(//tr/td)[12]/input")).toLeftOf(By.xpath("(//tr/td)[13]/input"))).click();

		driver.findElement(RelativeLocator.with(By.xpath("(//tr/td)[17]/input")).toLeftOf(By.xpath("(//tr/td)[18]"))).click();

		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("(//tr/td)[1]/input")).getText());
		
		driver.close();
		

	}

}
