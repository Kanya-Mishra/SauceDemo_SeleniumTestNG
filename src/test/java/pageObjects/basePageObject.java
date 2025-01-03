package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePageObject {
	
	static WebDriver driver;
	
	public basePageObject(WebDriver driver) {
		basePageObject.driver = driver;
		PageFactory.initElements(driver,this);
		System.out.println("We are at basePageObject");		
	}
}
