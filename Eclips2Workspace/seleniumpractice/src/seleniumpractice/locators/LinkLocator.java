package seleniumpractice.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocator {
    
    public static void main(String[] args) {
        
        try {
            // Set Chrome driver executable path
           // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

            // Initialize ChromeDriver
            ChromeDriver driver = new ChromeDriver();

            // Implicitly wait for 3 seconds (you can replace this with explicit waits as needed)
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            // Navigate to Facebook
            driver.get("https://www.facebook.com");

            // Find email and password fields and input data
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));

            emailField.sendKeys("sachine@gmail.com");
            passwordField.sendKeys("Vinit@1233");

            // Wait for 3 seconds (you can replace this with explicit waits as needed)
            Thread.sleep(3000);

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            // Print any exception that occurs
            System.out.println(e.getMessage());
        }
    }
}
