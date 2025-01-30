import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProcess {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://demo.guru99.com/test/login.html");

        // Enter email
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("your_email@example.com");

        // Enter password
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("your_password");

        // Click on Login button
        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();

        // Close the browser
        driver.quit();
    }
}

}
