package Saucedemo;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removeproduct {
    WebDriver driver;

   
    public Removeproduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeProductButton;

    @FindBy(xpath = "//*[@id='item_4_title_link']/div")
    WebElement verifyProduct;

    public void remove() {
        removeProductButton.click();

        
        try {
            if (!verifyProduct.isDisplayed()) {
                System.out.println("Product removed successfully.");
            } else {
                System.out.println("Product still displayed after removal.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Product successfully removed.");
        }
    }
}
