package Revison2704;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingEvent {
    public static void main(String[] args) {
        ChromeDriver driver = null;
        try {
            // Set system property to the location of chromedriver
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize ChromeDriver instance
            driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            // Implicitly wait for elements to be present
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Navigate to Edurekha website
            driver.get("https://www.edurekha.co/");

            // Wait for 1 second (just for demonstration purposes)
            Thread.sleep(1000);

            // Locate elements
            WebElement browserCategories = driver.findElement(By.xpath("//input[@id='search-input']"));
            WebElement frontEndDevelopment = driver.findElement(By.xpath("//div[@class='two_date_at_top']//div[@class='row']//div[1]//a[1]"));
            WebElement cloudArchitect = driver.findElement(By.xpath("//b[normalize-space()='Cloud Architect']"));

            // Instantiate Actions class
            Actions actions = new Actions(driver);

            // Perform mouse hover actions
            actions.moveToElement(frontEndDevelopment).pause(Duration.ofSeconds(3)).perform();
            actions.moveToElement(cloudArchitect).pause(Duration.ofSeconds(3)).perform();
            actions.moveToElement(browserCategories).click().perform();

            // Wait for 3 seconds (just for demonstration purposes)
            Thread.sleep(3000);

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
