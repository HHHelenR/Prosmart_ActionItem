package Automation_Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q5_Gmail_Validation {

	@Test
	public void Q5() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hhele\\Downloads\\browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		String text = driver.findElement(By.className("gb_d")).getText();
		Assert.assertEquals("Gmail", text);
		driver.close();
	}
}
