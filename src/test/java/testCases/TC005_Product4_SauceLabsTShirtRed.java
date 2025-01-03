/*
This Java Program is to verify if the 1st product test by clicking the Product hyperlink "Sauce Labs BikeLight" 
works in general for "www.saucedemo.com". And adding the Product to the Cart and checkout the Product.
In TestNG Test-frameework, The parent class is loginTest.java class, which internally calls its parent class testBaselogin.java
of package 'testBase' and Test case (loginTest.java) calls the loginPageObject class which internally calls its parent class
basePageObject of 'Page Object' Package. And similarly TC005_Product4_SauceLabsTShirtRed.java calls
 product1_SauceLabsTShirtRedPageObject.class which internally calls basePageObject.java.
*/
package testCases;

import org.testng.annotations.Test;

import pageObjects.product4_SauceLabsTShirtRedPageObject;

public class TC005_Product4_SauceLabsTShirtRed extends TC001_loginTest{
	@Test
	public void product4_SauceLabsTShirtRed() {
		
		product4_SauceLabsTShirtRedPageObject product4 = new product4_SauceLabsTShirtRedPageObject (driver);
		
		product4.clickProduct4link();
		System.out.println("We are clicking the Product4 Link");
		product4.clickAddtoCartProduct4();
		product4.clickcartButton();
		System.out.println("We are in Add to Cart Product4");
	}
}
