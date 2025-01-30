package seleniumpoperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryModel {
	WebDriver driver;
	@FindBy(id = "user-name")
	WebElement userNameLocator;
	
	@FindBy(id="password")
	
	WebElement passwordLocator; 
	
	@FindBy(id = "login-button")
	WebElement loginLocator;
	
	
	
public PageFactoryModel(WebDriver driver) {
	try {
		
		//driver variable present in this class
		PageFactory.initElements(driver, this);
		} catch (Exception e) {
		System.out.println(e);
		}
		}
		public void enterUserName() {
		userNameLocator.sendKeys("standard_user");
		}
		public void enterPassword() {
		passwordLocator.sendKeys("secret_sauce");
		}
		public void clickOnLogin() {
		loginLocator.click();
		
		
	}
}
	
	
	
	