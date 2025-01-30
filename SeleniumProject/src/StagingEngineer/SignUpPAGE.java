package StagingEngineer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPAGE {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the staging.engineer.ai signup page
            driver.get("https://staging.engineer.ai/");

            // Locate the signup button and click it
            WebElement signupButton = driver.findElement(By.linkText("Sign Up"));
            signupButton.click();

            // Fill out the signup form
            WebElement firstNameField = driver.findElement(By.name("firstName"));
            firstNameField.sendKeys("John");

            WebElement lastNameField = driver.findElement(By.name("lastName"));
            lastNameField.sendKeys("Doe");

            WebElement emailField = driver.findElement(By.name("email"));
            emailField.sendKeys("puneet@gmail.com");

            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("Puneet123");

            WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
            confirmPasswordField.sendKeys("password123");

            // Click on the Submit button
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            submitButton.click();

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
