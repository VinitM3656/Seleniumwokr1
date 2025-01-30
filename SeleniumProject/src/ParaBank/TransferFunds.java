package ParaBank;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferFunds {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open ParaBank home page
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

            // Log in as a customer
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));

            usernameField.sendKeys("vinit12345");  // replace with a valid username
            passwordField.sendKeys("vinit12345");  // replace with a valid password
            loginButton.click();

            // Click on the "Bill Pay" link
            WebElement billPayLink = driver.findElement(By.linkText("Bill Pay"));
            billPayLink.click();

            // Enter payee information
            WebElement payeeNameField = driver.findElement(By.name("payee.name"));
            WebElement payeeAddressField = driver.findElement(By.name("payee.address.street"));
            WebElement payeeCityField = driver.findElement(By.name("payee.address.city"));
            WebElement payeeStateField = driver.findElement(By.name("payee.address.state"));
            WebElement payeeZipCodeField = driver.findElement(By.name("payee.address.zipCode"));
            WebElement payeePhoneNumberField = driver.findElement(By.name("payee.phoneNumber"));
            WebElement payeeAccountNumberField = driver.findElement(By.name("payee.accountNumber"));
            WebElement verifyAccountNumberField = driver.findElement(By.name("verifyAccount"));

            payeeNameField.sendKeys("Payee Name");
            payeeAddressField.sendKeys("123 Main St");
            payeeCityField.sendKeys("Anytown");
            payeeStateField.sendKeys("CA");
            payeeZipCodeField.sendKeys("12345");
            payeePhoneNumberField.sendKeys("1234567890");
            payeeAccountNumberField.sendKeys("987654321");  // replace with a valid account number
            verifyAccountNumberField.sendKeys("987654321");  // repeat the account number

            // Click on the "Add Payee" button
           // WebElement sendButton = driver.findElement(By.xpath("//input[@value='Add Payee']"));
           // sendButton.click();
            WebElement sendPaymentButton = driver.findElement(By.xpath("//input[@value='Send Payment']"));
            sendPaymentButton.click();

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
