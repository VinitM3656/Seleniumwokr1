package seleniumpractice.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod2 {
    ChromeDriver driver;

    @BeforeMethod
    void beforeMethod() {
        try {
            driver = new ChromeDriver(); // Initialize driver variable
            Thread.sleep(2000);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterMethod
    void afterMethod() {
        try {
            driver.findElement(By.id("user-name")).sendKeys("Standard_user");
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @Test
    void verifyLoginCredentials2() {
        try {
            driver.findElement(By.id("user-name")).sendKeys("problem_user");
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
