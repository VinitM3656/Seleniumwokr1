package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {
    public static void main(String[] args) throws InterruptedException {
     

       
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

       
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("john_doe");

           
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("password123");

         
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
            loginButton.click();

          
            Thread.sleep(4000);

           
            WebElement adminPageLink = driver.findElement(By.linkText("Admin Page"));
            adminPageLink.click();

            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
        	
        	
        	 Thread.sleep(3000);
            driver.quit();
        }
    }
}
