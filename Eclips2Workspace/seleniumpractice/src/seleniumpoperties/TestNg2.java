package seleniumpoperties;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg2 {
    @Test
    void LoginCredentials() {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(1000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com");

            // Find the username input field by ID and enter the username
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            Thread.sleep(2000);

            // Find the password input field by ID and enter the password
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);
            // Close the browser
            driver.quit();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
