package seleniumpoperties.Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFrameWork {
    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.saucedemo.com");
            WebElement userName = driver.findElement(By.id("user-name"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("login-button"));

            userName.sendKeys("standard_user"); // corrected username
            Thread.sleep(2000);

            password.sendKeys("secret_sauce"); // corrected password
            Thread.sleep(3000);

            loginButton.click();

            WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
            WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
            Thread.sleep(3000);

            menuButton.click();
            Thread.sleep(3000);

            logout.click();
            Thread.sleep(3000);
            
            
            

            driver.quit();
            
            
            driver.get("https://www.saucedemo.com");
            WebElement userName1 = driver.findElement(By.id("user-name"));
            WebElement password1 = driver.findElement(By.id("password"));
            WebElement loginButton1 = driver.findElement(By.id("login-button"));

            userName1.sendKeys("standard_user"); // corrected username
            Thread.sleep(2000);

            password1.sendKeys("secret_sauce"); // corrected password
            Thread.sleep(3000);

            loginButton1.click();

            WebElement menuButton1 = driver.findElement(By.id("react-burger-menu-btn"));
            WebElement logout1 = driver.findElement(By.id("logout_sidebar_link"));
            Thread.sleep(3000);

            menuButton1.click();
            Thread.sleep(3000);

            logout1.click();
            Thread.sleep(3000);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
