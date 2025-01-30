package Amazon;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class AdressAutoSave { 

	public static void main(String[] args) { 
		ChromeOptions chromeOptions = new ChromeOptions(); 
		ChromeDriver driver = new ChromeDriver(); 
		WebDriver driver1 = new ChromeDriver(chromeOptions); 

		driver1.manage().timeouts().pageLoadTimeout(15, TimeUnit.MINUTES); 

		// Launch the Online Store Website 
		try { 
			driver1.get("https://www.amazon.in/a/addresses/add?ref=ya_address_book_add_post"); 

			LoginPage login = new LoginPage(driver1); 
			
			// Replace with your emailId 
			login.set_username("mhetrevinit@gmail.com"); 
			login.continueButtonClick(); 

			// Replace with your password 
			login.set_password("Vinit@123"); 
			login.click_button(); 

			NewAddressDetails addAddress = new NewAddressDetails(driver1); 
			
			// Replace the fields as per your requirement 
			addAddress.set_fullname("xxxxx"); 
			addAddress.set_phonenumber("9552328673"); 
			addAddress.set_postalCode("413007"); 
			addAddress.set_addressLine1("411042 Swarget Pune"); 
			addAddress.set_addressLine2("411042 Swarget Pune"); 
			addAddress.set_city("Pune"); 
			
			// Actually state has to be set 
			// If not set, it will throw error while 
			// clicking on the next submit button 
			List<WebElement> allElements = driver1.findElements(By.xpath("//input[@class='a-button-input']")); 
			WebElement clickableElement; 
			for (WebElement element : allElements) { 
				if (element.getAttribute("aria-labelledby").equals("address-ui-widgets-form-submit-button-announce")) { 
					clickableElement = element; 
					clickableElement.click(); 
				} 
			} 

			
			Thread.sleep(5000); 
			
			driver1.get("https://www.amazon.in/a/addresses"); 

			Thread.sleep(5000); 
			
			 
			System.out.println("Successfully performed the operation of adding address"); 

			Thread.sleep(5000); 
		} catch (InterruptedException e) { 
			
			e.printStackTrace(); 
		} 

	
		driver1.quit(); 
		 
	} 

} 

class LoginPage { 
	private WebDriver driver; 

	@FindBy(id = "ap_email") 
	WebElement username; 
	@FindBy(id = "ap_password") 
	WebElement password; 
	@FindBy(id = "signInSubmit") 
	WebElement button; 
	@FindBy(id = "continue") 
	WebElement continueButton; 

	public LoginPage(WebDriver driver) { 
		
		PageFactory.initElements(driver, this); 
	} 

	public void set_username(String usern) { 
		username.clear(); 
		username.sendKeys(usern); 
	} 

	public void set_password(String userp) { 
		password.clear(); 
		password.sendKeys(userp); 
	} 

	public void click_button() { 
		button.submit(); 
	} 

	public void continueButtonClick() { 
		continueButton.submit(); 
	} 
} 

class NewAddressDetails { 
	// private WebDriver driver; 
	@FindBy(id = "address-ui-widgets-enterAddressFullName") 
	WebElement fullName; 
	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber") 
	WebElement phoneNumber; 

	@FindBy(id = "address-ui-widgets-enterAddressPostalCode") 
	WebElement postalCode; 
	@FindBy(id = "address-ui-widgets-enterAddressCity") 
	WebElement city; 

	@FindBy(id = "address-ui-widgets-enterAddressLine1") 
	WebElement addressLine1; 
	@FindBy(id = "address-ui-widgets-enterAddressLine2") 
	WebElement addressLine2; 
	// @FindBy(id = "address-ui-widgets-enterAddressStateOrRegion") 
	@FindBy(className = "a-button-inner") 
	WebElement stateOrRegion; 
	@FindBy(className = "a-button-input") 
	// @FindBy(xpath = "//input[@class='a-button-input']") 
	WebElement button; 

	public NewAddressDetails(WebDriver driver) { 
		// initialize elements 
		PageFactory.initElements(driver, this); 
	} 

	public void set_fullname(String fname) { 
		fullName.clear(); 
		fullName.sendKeys(fname); 
	} 

	public void set_phonenumber(String phnumber) { 
		phoneNumber.clear(); 
		phoneNumber.sendKeys(phnumber); 
	} 

	public void set_postalCode(String pcode) { 
		postalCode.clear(); 
		postalCode.sendKeys(pcode); 
	} 

	public void set_city(String cty) { 
		city.clear(); 
		city.sendKeys(cty); 
	} 

	public void set_addressLine1(String line1) { 
		addressLine1.clear(); 
		addressLine1.sendKeys(line1); 
	} 

	public void set_addressLine2(String line2) { 
		addressLine2.clear(); 
		addressLine2.sendKeys(line2); 
	} 

	public void set_stateOrRegion(String region) { 
		stateOrRegion.clear(); 
		stateOrRegion.sendKeys(region); 
	} 

	public void click_button() { 
		button.click(); 
	
		
	} 
} 

class EditAddressDetails1 { 
	private WebDriver driver; 

	@FindBy(className = "a-button-input") 
	WebElement button; 

	public EditAddressDetails1(WebDriver driver) { 
		
		PageFactory.initElements(driver, this); 

	} 

	public void click_button() { 
		button.submit(); 
	} 
} 
