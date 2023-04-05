package Action_Item_Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Item_7_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		System.out.println(driver
				.findElements(By.xpath("//div[@class='col-lg-3 col-md-6 mb-4 mb-lg-0 align-self-center px-5 py-3']//a"))
				.size());

	}

}
