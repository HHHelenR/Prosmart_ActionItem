package Automation_Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q6_Search_Functionality {

	@Test
	public void Q6() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hhele\\Downloads\\browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("$%+");
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).build().perform();
	}
}
