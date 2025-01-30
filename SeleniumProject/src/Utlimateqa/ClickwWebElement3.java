package Utlimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickwWebElement3 {
    public static void main(String[] args) {
      

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the Ultimate QA page
            driver.get("https://ultimateqa.com/about/");

            // Wait for a while to allow the page to load
            Thread.sleep(2000);

            // Click on the Facebook icon
            WebElement facebookIcon = driver.findElement(By.cssSelector(".icon-facebook"));
            facebookIcon.click();

            // Wait for a while to see the result
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
