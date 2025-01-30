package PPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By userName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	
	
	
	public LoginPage(WebDriver d) {
		
		driver = d;
		
	}
	
	public void enterUserName() {
		
		
		driver.findElement(userName).sendKeys("standard_user");
		
	}
	
	public void enterPassword() {
		
		driver.findElement(password).sendKeys("secret_sauce");
	}
	
	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}
