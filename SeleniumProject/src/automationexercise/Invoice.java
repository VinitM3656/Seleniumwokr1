package automationexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Invoice extends Abstract{
    WebDriver driver;

    @FindBy(xpath = "//a[@class='btn btn default checkout']")
    WebElement download;

    @FindBy(xpath = "//a[@class='btn btn primary']")
    WebElement continueButton;

    public Invoice(WebDriver driverhere) {
        super(driverhere);
        this.driver = driverhere;
        PageFactory.initElements(driver, this);
    }

    public void generateInvoice() {
        RegisterWhileCheckout rc = new RegisterWhileCheckout(driver);
        ((Object) rc).whileCheckout();
        rc.proceedBtn();
        download.click();
        continueButton.click();
        rc.deleteBtn();
    }
}
