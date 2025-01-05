/*
This Java Program is to verify if the 1st product test by clicking the Product hyperlink "Sauce Labs BikeLight" 
works in general for "www.saucedemo.com". And adding the Product to the Cart and checkout the Product.
In TestNG Test-frameework, The parent class is loginTest.java class, which internally calls its parent class testBaselogin.java
of package 'testBase' and Test case (loginTest.java) calls the loginPageObject class which internally calls its parent class
basePageObject of 'Page Object' Package. And similarly TC004_Product2_SauceLabsBikeLight.java calls
 product1_SauceLabsBikeLightPageObject.class which internally calls basePageObject.java.
*/
package testCases;

import org.testng.annotations.Test;

import pageObjects.product3_SauceLabsBikeLightPageObject;

public class TC004_Product3_SauceLabsBikeLight extends TC001_loginTest {
	@Test
	public void product3_description() {
		
		product3_SauceLabsBikeLightPageObject product3 = new product3_SauceLabsBikeLightPageObject(driver);
		
		product3.clickProduct3link();
		product3.clickAddtoCartProduct3();
//		product3.clickcartButton();
	}

}
