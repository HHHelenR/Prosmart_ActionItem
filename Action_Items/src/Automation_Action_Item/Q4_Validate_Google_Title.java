package Automation_Action_Item;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Q4_Validate_Google_Title{

	@Test	
	public void  Q4() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hhele\\Downloads\\browser driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");	
	Assert.assertEquals("Google", driver.getTitle());
	driver.close();
	}
	
}
