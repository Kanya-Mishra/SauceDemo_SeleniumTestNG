package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productsInCart_PageObject extends basePageObject{

		public productsInCart_PageObject(WebDriver driver) {
			super(driver);
		}
		
		//Locators
		@FindBy(xpath = "//div[@id='shopping_cart_container']")
		WebElement cartButton;
		
		@FindBy(xpath = "//button[@id='continue-shopping']")
		WebElement continueShoppingBtn;
		
		@FindBy(xpath = "//button[@id='checkout']")
		WebElement chkOutBtn;
	
		//Action Method
	
		public void clickCartBtn() {
			cartButton.click();
		}
		
		public void clickContinueBtn() {
			continueShoppingBtn.click();
		}
		
		public void clickCheckOutBtn() {
			chkOutBtn.click();
		}
		
}
