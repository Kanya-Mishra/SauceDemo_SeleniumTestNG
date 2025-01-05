/*
This Java Program is to verify if the product in the Cart can be checked out.
In TestNG Test-frameework, The parent class is loginTest.java class, which internally calls its parent class testBaselogin.java
of package 'testBase' and Test case (loginTest.java) calls the loginPageObject class which internally calls its parent class
basePageObject of 'Page Object' Package. And similarly TC006_ProductsInCart.java calls productsInCart_PageObject.class
 which internally calls basePageObject.java.
*/
package testCases;

import org.testng.annotations.Test;
import pageObjects.productsInCart_PageObject;

public class TC006_ProductsInCart extends TC001_loginTest{
	
	@Test
	public void productsInCart() {
		
		productsInCart_PageObject inCart = new productsInCart_PageObject (driver);
		
		inCart.clickCartBtn();
		System.out.println("We are clicking the Cart Button");
		inCart.clickCheckOutBtn();
		System.out.println("We are in Cart Checkout");
	}

}
