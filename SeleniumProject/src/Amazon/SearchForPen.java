package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForPen {

    public static void main(String[] args) {
      
       System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromdriver.exe");

    
        WebDriver driver = new ChromeDriver();

        try {
          
            driver.get("https://www.amazon.com");

           
            WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
            signInLink.click();

         
            WebElement emailInput = driver.findElement(By.id("ap_email"));
            emailInput.sendKeys("mhetrevinit@gmail.com");

            WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();

            WebElement passwordInput = driver.findElement(By.id("ap_password"));
            passwordInput.sendKeys("Vinit@123");

            WebElement signInButton = driver.findElement(By.id("signInSubmit"));
            signInButton.click();

         
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("pens");
            searchBox.submit();

            
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}
