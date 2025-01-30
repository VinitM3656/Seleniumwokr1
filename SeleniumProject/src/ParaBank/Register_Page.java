package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Page {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open ParaBank home page
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

            // Click on the "Register" link
            WebElement registerLink = driver.findElement(By.linkText("Register"));
            registerLink.click();

            WebElement firstNameField = driver.findElement(By.name("customer.firstName"));
            firstNameField.sendKeys("John");

            WebElement lastNameField = driver.findElement(By.name("customer.lastName"));
            lastNameField.sendKeys("Doe");

            WebElement addressField = driver.findElement(By.name("customer.address.street"));
            addressField.sendKeys("123 Main St");

            WebElement cityField = driver.findElement(By.name("customer.address.city"));
            cityField.sendKeys("City");

            WebElement stateField = driver.findElement(By.name("customer.address.state"));
            stateField.sendKeys("Maharashtra");

            WebElement zipCodeField = driver.findElement(By.name("customer.zipcode"));
            zipCodeField.sendKeys("45678");
          
            WebElement phoneNumberField = driver.findElement(By.name("customer.phoneNumber"));
            phoneNumberField.sendKeys("9887650987");
            
            
            WebElement ssnField = driver.findElement(By.name("customer.ssn"));
            ssnField.sendKeys("123-23-4356");
            
            WebElement usernameField = driver.findElement(By.name("customer.username"));
            usernameField.sendKeys("jhoney_doe");
            
            
           WebElement passwordField = driver.findElement(By.name("customer.password"));
           passwordField.sendKeys("password123");
           
          WebElement confirmPasswordField = driver.findElement(By.name("repeatedPassword"));
          confirmPasswordField.sendKeys("password123");
          
          WebElement registerButton = driver.findElement(By.xpath("//input[@value='Register']"));
          registerButton.click();
          
        

          
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}

         