package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class product2_SauceLabsBackpackPageObject extends basePageObject {

			public product2_SauceLabsBackpackPageObject(WebDriver driver) {		//Constructor
				super(driver);
			}
			
			//Locators
			@FindBy(xpath = "//a[@id='item_4_title_link']")
			WebElement product2link;
			
			@FindBy(xpath = "//button[@id='add-to-cart']")
			WebElement addToCartProduct2;
			
			@FindBy(xpath = "//div[@id='shopping_cart_container']")
			WebElement cartButton;
			
			public void clickProduct2link() {
				product2link.click();
			}
		
			public void clickAddtoCartProduct2() {
				addToCartProduct2.click();
			}
			
			public void clickcartButton() {
				cartButton.click();
			}	

}
