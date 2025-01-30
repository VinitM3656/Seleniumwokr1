package Utlimateqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadWebPage {
    public static void main(String[] args) {
      

        
        WebDriver driver = new ChromeDriver();

        try {
          
            driver.get("https://ultimateqa.com");

            
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
            driver.quit();
        }
    }
}
