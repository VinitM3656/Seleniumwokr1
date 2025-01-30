package Revison2704;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        ChromeDriver driver = null;
        try {
            // Set system property to the location of chromedriver
           // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize ChromeDriver instance
            driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            // Implicitly wait for elements to be present
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Navigate to demoqa button page
            driver.get("https://demoqa.com/button");

            // Locate double click and right click buttons
            WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
            WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

            // Instantiate Actions class
            Actions actions = new Actions(driver);

            // Perform double click action
            actions.doubleClick(doubleClickButton).perform();
            Thread.sleep(2000); // Wait for 2 seconds (just for demonstration purposes)

            // Perform right click action
            actions.contextClick(rightClickButton).perform();

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
