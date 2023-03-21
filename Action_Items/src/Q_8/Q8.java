package Q_8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q8 {
	
	@Test(dataProvider = "getData")
	public void login(String name, String password){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hhele\\Downloads\\browser driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//enter user-name
		driver.findElement(By.id("user-name")).sendKeys(name);
		//enter password
		driver.findElement(By.id("password")).sendKeys(password);
		//click on login
		driver.findElement(By.id("login-button")).click();
	}
	
	@DataProvider
	public String[][] getData(){
		String [][] account = new String [4][2];
		account[0][0]="standard_user";
		account[0][1]="secret_sauce";
		account[1][0]="locked_out_user";
		account[1][1]="secret_sauce";
		account[2][0]="problem_user";
		account[2][1]="secret_sauce";
		account[3][0]="performance_glitch_user";
		account[3][1]="secret_sauce";
		return account;
	}
	
}
