

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void initializeDriver() {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver/chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        // Navigate to the URL
        driver.get("https://demo.guru99.com/test/login.html");

        // Enter username
        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.sendKeys("your_username");

        // Enter password
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("your_password");

        // Click on Login button
        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();
    }

    @AfterTest
    public void closeBrowser() {
        // Close the browser
        driver.quit();
    }
}
