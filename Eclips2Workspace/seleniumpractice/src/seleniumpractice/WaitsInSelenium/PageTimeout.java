package seleniumpractice.WaitsInSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTimeout {
    public static void main(String[] args) {
        try {
          //  WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            WebElement userName = driver.findElement(By.name("txtUsername"));
            userName.sendKeys("Admin");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
