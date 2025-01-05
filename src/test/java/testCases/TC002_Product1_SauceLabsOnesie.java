/*
This Java Program is to verify if the 1st product test by clicking the Product hyperlink "Sauce Labs Onesie" 
works in general for "www.saucedemo.com". And adding the Product to the Cart.
In TestNG Test-frameework, The parent class is loginTest.java class, which internally calls its parent class testBaselogin.java
of package 'testBase' and Test case (loginTest.java) calls the loginPageObject class which internally calls its parent class
basePageObject of 'Page Object' Package. And similarly TC002_Product1_SauceLabsOnesie.java calls
 product1_SauceLabsOnesiePageObject.class which internally calls basePageObject.java.
*/
package testCases;

import org.testng.annotations.Test;

import pageObjects.product1_SauceLabsOnesiePageObject;

public class TC002_Product1_SauceLabsOnesie extends TC001_loginTest{
	@Test
	public void product1_description() {
	
		product1_SauceLabsOnesiePageObject product1 = new product1_SauceLabsOnesiePageObject(driver);
	
		product1.clickProduct1link();
		product1.clickAddtoCartProduct1();
//		product1.clickcartButton();
	}
}
