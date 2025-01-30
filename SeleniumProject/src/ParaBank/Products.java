package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {
    public static void main(String[] args) {
      
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

           
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("vinit123");

           
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("vinit123");

            
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
            loginButton.click();

           
            Thread.sleep(3000);

        
            WebElement servicesLink = driver.findElement(By.linkText("Products"));
            servicesLink.click();

       
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}
