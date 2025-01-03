/*
This TestNG Program is to verify if the Login test using Page Object Model and valid Username and password 
works in general for "www.saucedemo.com".
In TestNG Test-frameework, The parent class of loginTest.java class is testBaselogin.java of package 'testBase' and
Test case calls the loginPageObject class which internally calls its parent class basePageObject of 'Page Object' Package. 
*/
package testCases;

//import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.loginPageObject;
import testBase.testBaselogin;

public class TC001_loginTest extends testBaselogin {
	@Test
	public void logincredentails() 
	{
		System.out.println("We are in Login Test-Starting");
		loginPageObject lpo = new loginPageObject(driver);
		
		lpo.clickUsername();
		lpo.sendUsernameKeys("standard_user");
		System.out.println("We are in Login Test-Clicking Username");
		
		lpo.clickPassword();
		lpo.sendPasswordKeys("secret_sauce");
		System.out.println("We are in Login Test-Clicking Password");
		
		lpo.loginbtn();
		System.out.println("We are in Login Button");
	}

}
