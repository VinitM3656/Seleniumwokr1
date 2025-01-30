package Amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCards {

    public static void main(String[] args) {
      
       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");

     
        WebDriver driver = new ChromeDriver();

       
        driver.manage().window().maximize(); 

     
        driver.get("https://www.amazon.in/ap/signin?ie=UTF8&ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fap%2Fsignin%3Fopenid.pape.max_auth_age%3D900%26openid.return_to%3Dhttps%253A%252F%252Fwww.amazon.in%252Fgp%252Fyourstore%252Fhome%253Fpath%253D%25252Fgp%25252Fyourstore%25252Fhome%2526useRedirectOnSuccess%253D1%2526signIn%253D1%2526action%253Dsign-out%2526ref_%253Dnav_AccountFlyout_signout%26openid.assoc_handle%3Dinflex%26openid.mode%3Dcheckid_setup%26openid.ns%3Dhttp%253A%252F%252Fspecs.openid.net%252Fauth%252F2.0&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");

    
        By signInLinkLocator = By.id("nav-link-accountList");
        WebElement signInLink = driver.findElement(signInLinkLocator);
        signInLink.click();

     
        By emailInputLocator = By.id("ap_email");
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys("mhetrevinit@gmail.com"); 
        By continueButtonLocator = By.id("continue");
        WebElement continueButton = driver.findElement(continueButtonLocator);
        continueButton.click();
 
        By passwordInputLocator = By.id("ap_password");
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys("Vinit@123"); 
        By signInButtonLocator = By.id("signInSubmit");
        WebElement signInButton = driver.findElement(signInButtonLocator);
        signInButton.click();

        driver.get("https://www.amazon.com/gift-cards");

       
        By giftCardBalanceLocator = By.xpath("//span[@id='gc-ui-balance-gc-balance-value']");
        WebElement giftCardBalance = driver.findElement(giftCardBalanceLocator);
        System.out.println("Your Gift Card Balance: " + giftCardBalance.getText());

       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      
        driver.quit();
    }
}
