package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class invoice  extends Abstract Methods {
	WebDriver driver;

	public invoice(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver);
	}
	@FindBy (xpath = "//a[@class='btn btn default checkout']")
	WebElement download;
	
	@FindBy (xpath = "//a[@class='btn btn primary']")
	WebElement ctnbtn;

	public void download() {
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.whilecheckout();
		rc.proceedbtn();
		download.click();
		ctnbtn.click();
		rc.deletebtn();
	}
}
