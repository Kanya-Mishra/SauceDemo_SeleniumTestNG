package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class product3_SauceLabsBikeLightPageObject extends basePageObject{
	
		public product3_SauceLabsBikeLightPageObject(WebDriver driver) {
				super(driver);
		}
	
		//Locators
		@FindBy(xpath = "//a[@id='item_0_title_link']")
		WebElement product3link;
		
		@FindBy(xpath = "//button[@id='add-to-cart']")
		WebElement addToCartProduct3;
		
		@FindBy(xpath = "//div[@id='shopping_cart_container']")
		WebElement cartButton;
		
		public void clickProduct3link() {
			product3link.click();
		}
	
		public void clickAddtoCartProduct3() {
			addToCartProduct3.click();
		}
		
		public void clickcartButton() {
			cartButton.click();
		}

}
