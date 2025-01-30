
package Amazon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    public static void main(String[] args) {
      
      
       
        WebDriver driver = new ChromeDriver();

       
        driver.manage().window().maximize();

        
        driver.get("https://www.amazon.com/");

     
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));

       
        Actions act = new Actions(driver);

       
        act.moveToElement(electronicsLink).perform();

        

        
        driver.quit();
    }
}
