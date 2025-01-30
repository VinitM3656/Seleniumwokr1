package Globalsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
      

        
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://www.globalsqa.com/");

            
            Thread.sleep(2000);

           
            WebElement HOMELink = driver.findElement(By.linkText("HOME"));
           HOMELink.click();

           driver.navigate().back();
           
            Thread.sleep(3000);
            WebElement CHEATSHEETSLink = driver.findElement(By.linkText("CHEATSHEETS"));
            CHEATSHEETSLink.click();
            Thread.sleep(3000);
            driver.navigate().back();
            
            
            WebElement FREEBOOKSLink = driver.findElement(By.linkText("FREEBOOKS"));
            FREEBOOKSLink.click();
            
            driver.navigate().back();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
