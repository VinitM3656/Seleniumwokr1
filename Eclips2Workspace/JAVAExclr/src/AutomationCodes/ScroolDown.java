package AutomationCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScroolDown {
    
    public static void main(String [] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(2000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='ApjFqb']"));
            
            Actions a = new Actions(driver);
            a.moveToElement(searchBox).click().perform();
            a.pause(Duration.ofSeconds(2)).sendKeys("EXceler").perform(); // Changed the pause duration
            
            for(int i = 0; i < 4; i++) {
                a.pause(Duration.ofSeconds(2)).sendKeys(Keys.DOWN).perform(); // Changed the pause duration
            }
            
            a.pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).perform(); // Changed the pause duration
            
            Thread.sleep(2000);
            driver.quit();
            
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
