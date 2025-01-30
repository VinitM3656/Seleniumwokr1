package Utlimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickWebElement2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       

        try {
            driver.get("https://ultimateqa.com");

            WebElement AboutLink = driver.findElement(By.linkText("About"));
            AboutLink.click();

         Thread.sleep(2000);
         driver.navigate().back();
           

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	 Thread.sleep(2000);
        	 driver.navigate().back();
        	
            // Close the browser
            driver.quit();
        }
    }
}
