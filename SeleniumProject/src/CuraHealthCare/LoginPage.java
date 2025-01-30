package CuraHealthCare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

      
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

          
            WebElement usernameField = driver.findElement(By.id("txt-username"));
            usernameField.sendKeys("PuneetK");
            

           
            WebElement passwordField = driver.findElement(By.id("txt-password"));
            passwordField.sendKeys("Puneetk123");

           
            WebElement loginButton = driver.findElement(By.id("btn-login"));
            loginButton.click();

            
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}
