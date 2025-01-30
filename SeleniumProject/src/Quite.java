
//public class Quite 
//package Selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Quite {
    public static void main(String[] args) {
        try {
            //WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            Thread.sleep(3000);

            driver.get("D:\\cctv\\new 2.html"); // Corrected file path with file:///
            Thread.sleep(2000);

            WebElement clickHereLink = driver.findElement(By.linkText("Click here for page-2")); // Corrected Driver to driver
            clickHereLink.click();
            Thread.sleep(2000);

            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
