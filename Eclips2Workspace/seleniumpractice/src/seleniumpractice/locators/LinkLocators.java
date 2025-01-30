package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocators {
    
    public static void main(String[] args) {
        
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(4000);
            driver.get("https://www.facebook.com");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgotten account?"));
            forgotPasswordLink.click();
            Thread.sleep(2000);
            driver.quit();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
