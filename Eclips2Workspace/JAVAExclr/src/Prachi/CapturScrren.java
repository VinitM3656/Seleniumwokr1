package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class CapturScrren {
    
    public static void main(String[] args) throws Exception {
        // Set system property for ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.saucedemo.com/");

        // Find the element to capture
        WebElement section = driver.findElement(By.xpath("//input[@id='user-name']"));

        // Take a screenshot of the element
        File src = section.getScreenshotAs(OutputType.FILE);

        // Specify destination directory for the screenshot
        File dest = new File("D:\\MOVIES\\Selenium-LATEST\\Prachi\\screenshot.png");

        // Copy the screenshot to the destination directory
        FileHandler.copy(src, dest);

        // Close the browser
        driver.quit();
    }
}
