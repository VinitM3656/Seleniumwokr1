package Repractice.Locators.Xpath;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchbox {
    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Corrected method name for implicitly wait
            driver.get("file:///D:/MOVIES/Selenium-LATEST/alert.html"); // Corrected file URL format
            Thread.sleep(2000);
            
            WebElement pageLink = driver.findElement(By.linkText("Click here for page2"));
            pageLink.click();
            Thread.sleep(3000);
            
            Set<String> allIds = driver.getWindowHandles();
            ArrayList<String> al = new ArrayList<String>(allIds);
            System.out.println(al.get(1));
            
            driver.switchTo().window(al.get(1));
            driver.findElement(By.linkText("Click here for page3")).click();
            Thread.sleep(3000);
            
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
