package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
    
    @FindBy(linkText = "Register")
    private WebElement register_link;
    
    @FindBy(linkText = "Login")
    private WebElement login_link;
    
    @FindBy(linkText = "Shopping cart")
    private WebElement shoppingCart_link;
    
    @FindBy(id = "small-searchterm")
    private WebElement searchBar;
    
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    
    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void clickRegisterLink() {
        register_link.click();
    }
    
    public void clickLoginLink() {
        login_link.click();
    }
    
    public void clickShoppingCartLink() {
        shoppingCart_link.click();
    }
    
    public void enterSearchItem(String item) {
        searchBar.sendKeys(item);
    }
    
    public void clickSubmitButton() {
        submitButton.click();
    }
}
