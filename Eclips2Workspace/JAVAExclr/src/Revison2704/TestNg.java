package Revison2704;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test; // Correct import statement
//import io.github.bonigarcia.wdm.WebDriverManager; // Correct import statement
import java.time.Duration;

public class TestNg {
    @Test
    public void verifyLoginCredentials1() { // Changed method signature to void
        try {
            //WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("standard_user"); // Corrected id
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys("secret_sauce"); // Corrected id and value
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click(); // Corrected id
            Thread.sleep(2000);
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void verifyLoginCredentials2() { // Changed method signature to void
        try {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("problem_user"); // Corrected id
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys("secret_sauce"); // Corrected id and value
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click(); // Corrected id
            Thread.sleep(2000);
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
