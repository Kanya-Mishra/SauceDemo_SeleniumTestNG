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
