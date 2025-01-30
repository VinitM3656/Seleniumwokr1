package Vinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Open the demoqa.com/buttons page
        driver.get("https://demoqa.com/buttons");
        
        // Find the button element using XPath
        WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        
        // Create an Actions object
        Actions act = new Actions(driver);
        
        // Perform a double-click action on the button
        act.doubleClick(button).perform();
        
        // Close the browser window
        driver.quit();
    }
}
