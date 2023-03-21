package Action_Item_9;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Action_Item_Q2 {

	@Test
	public void Screenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hhele\\Downloads\\browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType .FILE);
		Files.copy(scr, new File(System.getProperty("user.dir") +"\\Screenshots\\Action_Item_Q2.png"));
		
	}
}
