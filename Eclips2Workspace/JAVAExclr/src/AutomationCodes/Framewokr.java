package AutomationCodes;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framewokr {
    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\JAVAExclr\\src\\AutomationCodes\\data.properties");
            Properties p = new Properties();
            p.load(fis);
            String url = p.getProperty("url"); // Corrected method name
            String un = p.getProperty("username"); // Corrected property key
            String pw = p.getProperty("password"); // Corrected property key

            driver.get(url);
            WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));

            userName.sendKeys(un);
            Thread.sleep(3000);
            password.sendKeys(pw);
            Thread.sleep(2000);
            loginButton.click();
            WebElement menuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")); // Corrected element ID
            WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")); // Corrected element ID
            Thread.sleep(3000);
            menuButton.click();
            Thread.sleep(3000);
            logout.click();
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
