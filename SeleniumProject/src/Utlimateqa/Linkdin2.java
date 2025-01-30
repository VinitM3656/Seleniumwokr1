package Utlimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdin2 {
    public static void main(String[] args) {
      
       
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://ultimateqa.com");

           
            WebElement linkedInLink = driver.findElement(By.linkText("LinkedIn"));
            linkedInLink.click();

            
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
