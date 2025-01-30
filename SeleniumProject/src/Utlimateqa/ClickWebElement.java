package Utlimateqa;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickWebElement {
    public static void main(String[] args) throws InterruptedException {
      
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://ultimateqa.com/automation");

           
          
            Thread.sleep(3000);

        
            WebElement IwantaFreeDiscoverySessionLink = driver.findElement(By.linkText("IwantaFreeDiscoverySession"));
            IwantaFreeDiscoverySessionLink.click();

       
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	
        	
        	Thread.sleep(3000);

            
            driver.quit();
        }
    }
}
