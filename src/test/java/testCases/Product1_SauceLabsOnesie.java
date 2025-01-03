/*
This Java Program is to verify if the 1st product test by clicking the Product hyperlink "Sauce Labs Onesie" works in general for "www.saucedemo.com"
And adding the Product to the Cart and checkout the Product.
*/
package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.asserts.Assertion;

public class Product1_SauceLabsOnesie {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();                                        						//Initializing the WebDriver
		
		driver.manage().deleteAllCookies();															//To delete all Cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));							//To implicitly wait for 2 seconds
		driver.get("https://www.saucedemo.com/");													//Open the Sauce Demo URL
		driver.manage().window().maximize();														//To Maximize the window
		
		driver.findElement(By.xpath("//input[@id='user-name']")).click();							//To Click on the Username Text box	
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");			//To send the valid Username "stand_user"
		
		driver.findElement(By.xpath("//input[@id='user-name']")).click();							//To click on the Password textbox
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");			//To send the valid Password "secret_sauce"
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();						//To click on the Login button
		
		driver.findElement(By.xpath("//a[@id='item_2_title_link']")).click();   					//Click on the Product hyperlink
		
		WebElement wel = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));   //Verifying if the Price is equals to expected price
		String result = wel.getText();
		
		Assert.assertEquals(wel.getText(), "$7.99");
		
		System.out.println(result);                         										//Printing the Actual output
		
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();						//Click to add the product to cart
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();					//Click on the cart button
		driver.findElement(By.xpath("//button[@id='checkout']")).click();							//Click on the Checkout button to checkout
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();					//Click on the Continue Shopping Button
		
	}

}
