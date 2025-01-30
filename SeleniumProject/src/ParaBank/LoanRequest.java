package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoanRequest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open ParaBank homepage
            driver.get("https://parabank.parasoft.com/parabank/index.htm");
            
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));

            usernameField.sendKeys("vinit12345");  // replace with a valid username
            passwordField.sendKeys("vinit12345");  // replace with a valid password
            loginButton.click();

            // Click on the "Loan" link
            WebElement loanLink = driver.findElement(By.linkText("Loan"));
            loanLink.click();

            // Click on the "Apply for a Loan" link
            WebElement applyForLoanLink = driver.findElement(By.linkText("Apply for a Loan"));
            applyForLoanLink.click();

            // Fill out the loan application form
            WebElement loanAmountField = driver.findElement(By.name("amount"));
            loanAmountField.sendKeys("5000");

            WebElement downPaymentField = driver.findElement(By.name("downPayment"));
            downPaymentField.sendKeys("1000");

            WebElement applyButton = driver.findElement(By.xpath("//input[@value='Apply Now']"));
            applyButton.click();

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
