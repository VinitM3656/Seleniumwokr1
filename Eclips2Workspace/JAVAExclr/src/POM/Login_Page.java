package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    
    @FindBy(id = "Email")
    private WebElement email_tb;
    
    @FindBy(id = "Password")
    private WebElement password_tb;
    
    @FindBy(id = "RememberMe")
    private WebElement remember_chek_box;
    
    @FindBy(linkText = "Forgot password?")
    private WebElement forgot_password;
    
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement login_but;

    // Constructor
    public Login_Page(WebDriver driver) {
        PageFactory.initElements(driver, this); // Added missing semicolon
    }
    
    // Methods to interact with elements
    
    public void setEmail(String email) { // Renamed method to follow camelCase convention
        email_tb.sendKeys(email);
    }
    
    public void setPassword(String pwd) { // Renamed method to follow camelCase convention
        password_tb.sendKeys(pwd);
    }
    
    public void clickLoginButton() { // Renamed method to follow camelCase convention
        login_but.click();
    }
}
