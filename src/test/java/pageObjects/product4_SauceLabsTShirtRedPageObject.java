package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class product4_SauceLabsTShirtRedPageObject extends basePageObject {

		public product4_SauceLabsTShirtRedPageObject(WebDriver driver) {	//Constructor		
			super(driver);
		}		
				
		//Locators
		@FindBy(xpath = "//a[@id='item_3_title_link']")
		WebElement product4link;
				
		@FindBy(xpath = "//button[@id='add-to-cart']")
		WebElement addToCartProduct4;
				
		@FindBy(xpath = "//div[@id='shopping_cart_container']")
		WebElement cartButton;
				
		public void clickProduct4link() {
		product4link.click();
		}
			
		public void clickAddtoCartProduct4() {
		addToCartProduct4.click();
		}
				
		public void clickcartButton() {
		cartButton.click();
		}
}
