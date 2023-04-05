package Action_Item_Second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Item_7_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		js.executeScript("window.scrollBy(0,450)");
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("Total column = " + column.size() + ", total row = " + row.size()); 
		System.out.println("Company info: " + driver.findElement(By.xpath("//a[contains(text(), 'IDFC Bank')]//ancestor::tr")).getText());

		driver.close();

	}

}
