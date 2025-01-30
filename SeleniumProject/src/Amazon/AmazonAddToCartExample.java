

package Amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AmazonAddToCartExample {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

      
        driver.get("https://www.amazon.in/Redmi-Coral-Purple-128GB-Storage/dp/B0CRQG58T8/ref=sr_1_1?crid=2VFH2E0KZCRTV&keywords=redmi+note+13+pro&qid=1705998495&sprefix=redmi%2Caps%2C197&sr=8-1s");

       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       
        By addToCartButtonLocator = By.xpath("//input[@id='add-to-cart-button']");
        WebElement addToCartButton = driver.findElement(addToCartButtonLocator);

       
        addToCartButton.click();

      
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        driver.quit();
    }
}
