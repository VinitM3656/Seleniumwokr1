package Repractice.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(4000);
            
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.get("https://www.facebook.com");
            Thread.sleep(2000);
            
            WebElement emailField = driver.findElement(By.xpath("//input[@id='email']")); // Added double slashes (//) at the beginning of the XPath
            WebElement passField = driver.findElement(By.xpath("//input[@id='pass']")); // Added double slashes (//) at the beginning of the XPath
            
            emailField.sendKeys("vinit@gmail.com"); // Removed extra space before email
            passField.sendKeys("vinit@123"); // Removed extra space before password
            
            Thread.sleep(2000);
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // corrected the print statement
        }
    }
}
