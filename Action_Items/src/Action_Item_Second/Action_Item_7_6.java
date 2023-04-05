package Action_Item_Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Item_7_6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testpages.herokuapp.com/frames/index.html");
		driver.switchTo().frame(driver.findElement(By.xpath("(//frame[2])[1] ")));

		driver.findElement(By.xpath("(//li//a[@target='content'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'original')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'green')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'original')]")).click();

		driver.switchTo().parentFrame(); //switch back to the main frame to able to go to the next frame
		driver.switchTo().frame(driver.findElement(By.xpath("(//frame[1])[2]")));
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Menu 1')]")).getText());

	}

}
