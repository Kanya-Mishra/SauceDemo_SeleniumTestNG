package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testBaselogin {
	
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		System.out.println("We are in testBaselogin-setup Method");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("We are in testBaselogin-quit");
	}

}
