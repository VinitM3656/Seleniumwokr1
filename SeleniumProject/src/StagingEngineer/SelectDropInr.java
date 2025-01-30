package StagingEngineer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropInr {
    public static void main(String[] args) {
       
     

        
        WebDriver driver = new ChromeDriver();

        try {
          
            driver.get("https://staging.engineer.ai/home");

           
            WebElement currencyDropdown = driver.findElement(By.id("currency-select"));
            currencyDropdown.click();

            
            Select currencySelect = new Select(currencyDropdown);
            currencySelect.selectByVisibleText("Indian Rupee");

          
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
            driver.quit();
        }
    }
}
