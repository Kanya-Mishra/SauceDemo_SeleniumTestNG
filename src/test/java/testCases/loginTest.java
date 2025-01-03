/*
 This Java Program is to verify if the Login test using valid Username and password works in general for "www.saucedemo.com"
*/
package testCases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

public static void main(String[] args) {
				WebDriver driver;
				
				driver = new ChromeDriver();
				
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='user-name']")).click();
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				
				driver.findElement(By.xpath("//input[@id='user-name']")).click();
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				
				driver.quit();
	}

}
