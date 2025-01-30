

package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccountOpen {
    private static final WebElement TransferFunds = null;

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
           // WebElement transferFundsLink = driver.findElement(By.linkText("Transfer Funds"));
            //transferFundsLink.click();
            WebElement billPayLink = driver.findElement(By.linkText("Bill Pay"));
            billPayLink.click();

            // Enter payee information
            WebElement payeeNameField = driver.findElement(By.name("payee.name"));
            payeeNameField.sendKeys("Vinitxyz");

            WebElement payeeAddressField = driver.findElement(By.name("payee.address.street"));
            payeeAddressField.sendKeys("456 Solapur");

            WebElement payeeCityField = driver.findElement(By.name("payee.address.city"));
            payeeCityField.sendKeys("Solapur");

            WebElement payeeStateField = driver.findElement(By.name("payee.address.state"));
            payeeStateField.sendKeys("Maharashtra");

            WebElement payeeZipCodeField = driver.findElement(By.name("payee.address.zipCode"));
            payeeZipCodeField.sendKeys("12345");
            
            WebElement AccountField = driver.findElement(By.name("account"));
            AccountField.sendKeys("1234598876765674654");

            // Click on the "Add" button to save payee information
            WebElement addButton = driver.findElement(By.xpath("//input[@value='Add']"));
            addButton.click();

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