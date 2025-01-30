package StagingEngineer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickChooseBase {
    public static void main(String[] args) {
        

       
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://staging.engineer.ai/");

           
            WebElement signUpButton = driver.findElement(By.linkText("Sign Up"));
            signUpButton.click();

            
            WebElement emailField = driver.findElement(By.name("email"));
            emailField.sendKeys("puneet@gmail.com");

            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("Vinit@1234");

            WebElement confirmPasswordField = driver.findElement(By.name("confirm_password"));
            confirmPasswordField.sendKeys("Vinit@1234");

            
            WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
            submitButton.click();

         
            Thread.sleep(3000);

         
            WebElement chooseBaseButton = driver.findElement(By.xpath("//button[contains(text(),'Choose Base')]"));
            chooseBaseButton.click();

         
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
            driver.quit();
        }
    }
}
