package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product4_SauceLabsTShirtRed {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();																//Initializing the WebDriver
		
		driver.manage().deleteAllCookies();															//To delete all Cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));							//To implicitly wait for 2 seconds
		driver.get("https://www.saucedemo.com/");													//Open the Sauce Demo URL
		driver.manage().window().maximize();														//To Maximize the window
		
		driver.findElement(By.xpath("//input[@id='user-name']")).click();							//To Click on the Username Text box	
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");			//To send the valid Username "stand_user"
		
		driver.findElement(By.xpath("//input[@id='user-name']")).click();							//To click on the Password textbox
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");			//To send the valid Password "secret_sauce"
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();						//To click on the Login button
		
		driver.findElement(By.xpath("//a[@id='item_3_title_link']")).click();						//To Click on the hyperlink of the Product SauceLabs Backpack
		
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();    //To add the Product to the Cart
		
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();						//To Add to Cart from Product Description page
		
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();				//To Click on the cart to see Products added 
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();                           //To click the Checkout button
		
//		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();                  //To continue shopping click on the Continue Shopping Button

	}

}
