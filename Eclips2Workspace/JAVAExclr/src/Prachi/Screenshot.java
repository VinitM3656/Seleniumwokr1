package Prachi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Initializing ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigating to the URL
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        
        // Locating the WebElement
        WebElement section = driver.findElement(By.xpath("//img[@alt='Grocery']"));
        
        // Taking the screenshot
        File src = section.getScreenshotAs(OutputType.FILE);
        
        // Defining the destination path for the screenshot
        File dest = new File("D:\\MOVIES\\Selenium-LATEST\\Prachi\\New folder\\click.png");
        
        // Copying the screenshot file to the destination
        Files.copy(src.toPath(), dest.toPath());
        
        // Closing the WebDriver session
        driver.quit();
    }
}
