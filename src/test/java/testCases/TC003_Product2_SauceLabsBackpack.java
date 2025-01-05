/*
This Java Program is to verify if the 1st product test by clicking the Product hyperlink "Sauce Labs Backpack" 
works in general for "www.saucedemo.com". And adding the Product to the Cart and checkout the Product.
In TestNG Test-frameework, The parent class is loginTest.java class, which internally calls its parent class testBaselogin.java
of package 'testBase' and Test case (loginTest.java) calls the loginPageObject class which internally calls its parent class
basePageObject of 'Page Object' Package. And similarly TC003_Product2_SauceLabsBackpack.java calls
 product1_SauceLabsBackpackPageObject.class which internally calls basePageObject.java.
*/

package testCases;

import org.testng.annotations.Test;

import pageObjects.product2_SauceLabsBackpackPageObject;

public class TC003_Product2_SauceLabsBackpack extends TC001_loginTest{
		@Test
		public void product2_description() {
		
			product2_SauceLabsBackpackPageObject product2 = new product2_SauceLabsBackpackPageObject(driver);
		
			product2.clickProduct2link();
			product2.clickAddtoCartProduct2();
//			product2.clickcartButton();
	}

}
