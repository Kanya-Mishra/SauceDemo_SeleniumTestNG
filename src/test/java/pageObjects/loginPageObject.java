package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.FindBy;

public class loginPageObject extends basePageObject {
	
	public loginPageObject(WebDriver driver) {						//Constructor
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='user-name']")						//Locators
	WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath= "//input[@id='login-button']")
	WebElement loginbtn;
	
	public void clickUsername() {									//Action Method
		Username.click();
	}

	public void sendUsernameKeys(String username) {
		Username.sendKeys(username);
	}
	
	public void clickPassword() {
		Password.click();
	}
	
	public void sendPasswordKeys(String password) {
		Password.sendKeys(password);
	}
	
	public void loginbtn() {
		loginbtn.click();
	}

}
