package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateContactInfo {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open ParaBank home page
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

            // Enter username
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("vinit12345");

            // Enter password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("vinit12345");

            // Click on the Log In button
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
            loginButton.click();

            // Wait for a while to ensure successful login
            Thread.sleep(2000);

            // Click on the "Update Contact Info" link
            WebElement updateContactInfoLink = driver.findElement(By.linkText("Update Contact Info"));
            updateContactInfoLink.click();
            
            
            
            WebElement FirstNameField = driver.findElement(By.name("payee.name"));
            WebElement LastNameField = driver.findElement(By.name("payee.name"));
            WebElement AddressField = driver.findElement(By.name("payee.address.street"));
            WebElement CityField = driver.findElement(By.name("payee.address.city"));
            WebElement StateField = driver.findElement(By.name("payee.address.state"));
            WebElement ZipCodeField = driver.findElement(By.name("payee.address.zipCode"));
            WebElement PhoneNumberField = driver.findElement(By.name("payee.phoneNumber"));
           
           

            FirstNameField.sendKeys("VinitBhiaye");
            LastNameField.sendKeys("MMM");
            AddressField.sendKeys("123 Main St");
            CityField.sendKeys("Anytown");
            StateField.sendKeys("DELHI");
            ZipCodeField.sendKeys("1234512");
            PhoneNumberField.sendKeys("99999999999");
          


            // Wait for a while to see the result
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
