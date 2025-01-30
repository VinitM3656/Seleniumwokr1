import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsandwebelement {
    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver/chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://demo.guru99.com/test/radio.html");

       
        WebElement option1 = driver.findElement(By.id("Radio"));
        option1.click();

        
        WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
        WebElement checkbox3 = driver.findElement(By.id("checkbox3"));
        checkbox2.click();
        checkbox3.click();
    driver.get("https://demo.guru99.com/test/newtours/register.php"); 
        WebElement countryDropdown = driver.findElement(By.name("country"));
        Select select = new Select(countryDropdown);
        select.selectByVisibleText("KUWAIT");

       
        driver.quit();
    }
}