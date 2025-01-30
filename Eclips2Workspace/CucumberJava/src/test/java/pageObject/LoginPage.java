package pageObject;

import org.openqa.selenium.support.FindBy;

public class LoginPage<WebElement> {
    
    WebDriver ldriver;
    
    public LoginPage(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }
    
    @FindBy(id = "Email")
    WebElement email;
    
    @FindBy(id = "Password")
    WebElement password;
    
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginBtn;
    
    public void enterEmail(String emailAddr) {
        email.sendKeys(emailAddr);
    }
    
    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }
    
    public void clickOnLoginButton() {
        loginBtn.click();
    }
}
