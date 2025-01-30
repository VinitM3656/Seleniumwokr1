package seleniumpractice.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String [] args) {

        try {

            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement userName =
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));

            userName.sendKeys("admin");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
