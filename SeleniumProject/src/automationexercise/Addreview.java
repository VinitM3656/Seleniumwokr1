package automationexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Addreview extends Abstract {
    WebDriver driver;

    public Addreview(WebDriver driverhere) {
        super(driverhere);
        this.driver = driverhere;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='name']")
    WebElement enterName;

    @FindBy(xpath = "//input[@id='email']")
    WebElement enterEmail;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement submitButton;

    public void addReview() {
        
        enterName.sendKeys("Vinit");
        enterEmail.sendKeys("vinitbmhetre@gmail.com");
        submitButton.click();
        System.out.println("Thank you for the review."); 
    }
}
