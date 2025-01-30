

package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserName {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open ParaBank home page
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

            // Enter customer login credentials
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));

            usernameField.sendKeys("vinit12345"); // Replace with actual customer username
            passwordField.sendKeys("vinit12345"); // Replace with actual customer password

            // Click on the "Log In" button
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
            loginButton.click();

            // Wait for a while to ensure the login is successful
            Thread.sleep(3000);

            // Click on the "Open New Account" link
            WebElement UpdateContactInfoLink = driver.findElement(By.linkText("UpdateContactInfo"));
            UpdateContactInfoLink.click();

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
