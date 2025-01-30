package Revison2704;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordsEvent {
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
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            // Navigate to Google
            driver.get("https://www.google.com");

            // Locate the search box
            WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));

            // Instantiate Actions class
            Actions actions = new Actions(driver);

            // Click on the search box
            actions.moveToElement(searchBox).click().perform();
            actions.pause(Duration.ofSeconds(2)).perform();

            // Type "Excler" into the search box
           // actions.sendKeys("Excler").perform();

            // Press arrow down key 4 times
            for (int i = 0; i < 4; i++) {
                actions.pause(Duration.ofSeconds(3)).perform();
                actions.keyDown(Keys.ARROW_DOWN).perform();
            }

            // Press Enter key
            actions.keyDown(Keys.ENTER).perform();

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
