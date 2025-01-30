package automationexercise;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactForm extends Abstract{
    WebDriver driver;

    @FindBy(xpath = "//i[@class='fa fa-envelope']/parent::a")
    WebElement contactUs;

    @FindBy(xpath = "//i[@class='fa fa-home']/parent::a")
    WebElement homePage;

    @FindBy(xpath = "//*[contains(text(),'Get In Touch')]")
    WebElement getInTouchText;

    @FindBy(xpath = "//input[@class='btn btn-primary pull-left submit_form']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMsg;

    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;

    public ContactForm(WebDriver driverhere) {
        super(driverhere);
        this.driver = driverhere;
        PageFactory.initElements(driver, this);
    }

    public void contactForm() {
        implicitlyWaitMethod();
        try {
            homePage.click();
            Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");

            contactUs.click();
            
         Reusableclass rc = new Reusableclass(driver);
            rc.innerTextEquals(getInTouchText, "GET IN TOUCH");

            ReusableMethods cf = new ReusableMethods(driver);
            cf.contactform();

            uploadFile.sendKeys(System.getProperty("user.dir") + ("\\src\\testData\\ProjectData.xlsx"));
            submitButton.click();

            String message = driver.switchTo().alert().getText();
            System.out.println("Alert message = " + message);
            driver.switchTo().alert().accept();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", getInTouchText);

            rc.innerTextEquals(successMsg, "Success! Your details have been submitted successfully.");

            homePage.click();

            //rc.urlEquals("https://automationexercise.com/");
            System.out.println("Testcase6--> executed successfully");

        } catch (Exception e) {
            System.out.println("Exception occurred in contact form");
        }
    }

	public void implicitlyWaitMethod() {
	
		
	}
}
