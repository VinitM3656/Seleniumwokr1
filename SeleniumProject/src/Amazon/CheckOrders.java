package Amazon;

import org.openqa.selenium.By;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOrders {

    public static void main(String[] args) throws InterruptedException {
       

        WebDriver driver = new ChromeDriver();

       
        driver.manage().window().maximize();

   
        driver.get("https://www.amazon.com");

     
        
    

        
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
        

        By signInLinkLocator = By.id("nav-link-accountList");
        Thread.sleep(2000);
        
        WebElement signInLink = driver.findElement(signInLinkLocator);
        signInLink.click();

      
        By ordersLinkLocator = By.xpath("//span[contains(text(),'Returns & Orders')]");
        WebElement ordersLink = driver.findElement(ordersLinkLocator);
        ordersLink.click();

     
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
