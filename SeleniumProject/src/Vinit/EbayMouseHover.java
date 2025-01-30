package Vinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayMouseHover {
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "");

      
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       
        driver.get("https://www.ebay.com/");

       
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));

        
        electronicsLink.click();

       
        driver.quit();
    }
}
