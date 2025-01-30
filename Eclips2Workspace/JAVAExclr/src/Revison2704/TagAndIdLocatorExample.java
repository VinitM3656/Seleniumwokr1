package Revison2704;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndIdLocatorExample {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            // Set system property to the location of chromedriver
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize ChromeDriver instance
            driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to Facebook login page
            driver.get("https://www.facebook.com");

            // Wait for 2 seconds (just for demonstration purposes)
            Thread.sleep(2000);

            // Locate email and password fields by CSS selector using tag and ID
            WebElement emailField = driver.findElement(By.cssSelector("input#email"));
            WebElement passwordField = driver.findElement(By.cssSelector("input#pass"));

            // Enter email and password
            emailField.sendKeys("Vinit@gmail.com");
            passwordField.sendKeys("vinit@123");

            // Wait for 2 seconds (just for demonstration purposes)
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
