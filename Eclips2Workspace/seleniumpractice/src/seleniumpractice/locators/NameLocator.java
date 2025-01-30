package seleniumpractice.locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class NameLocator {
    public static void main(String[] args) {
       try {
    	   
    	   ChromeDriver driver = new ChromeDriver();
    	   Thread.sleep(2000);
    	   driver.get("https://www.facebook.com");
    	   Thread.sleep(2000);
    	   
    	   
    	   WebElement emailField= driver.findElement(By.name("email"));
    	   WebElement passField= driver.findElement(By.name("password"));
    	   
    	   emailField.sendKeys("vinitb@email.com");
           passField.sendKeys("vinit@1223");
           passField.sendKeys(Keys.RETURN); // Pressing Enter after entering the password
           
           Thread.sleep(3000);
           driver.quit(); // Changed to quit() instead of close()
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
}