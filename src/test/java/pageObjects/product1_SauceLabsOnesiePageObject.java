package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class product1_SauceLabsOnesiePageObject extends basePageObject{

		public product1_SauceLabsOnesiePageObject(WebDriver driver) {			//Constructor
			super(driver);
		}

		//Locators
		@FindBy(xpath = "//a[@id='item_2_title_link']")
		WebElement product1link;
		
		@FindBy(xpath = "//button[@id='add-to-cart']")
		WebElement addToCartProduct1;
		
		@FindBy(xpath = "//a[@class='shopping_cart_link']")
		WebElement cartButton;
		
		public void clickProduct1link() {
			product1link.click();
		}
	
		public void clickAddtoCartProduct1() {
			addToCartProduct1.click();
		}
		
		public void clickcartButton() {
			cartButton.click();
		}
}
