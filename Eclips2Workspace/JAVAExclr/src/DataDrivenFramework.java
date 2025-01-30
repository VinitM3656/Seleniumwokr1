import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFramework {

    public static void main(String[] args) {
        FileInputStream fis = null;
        WebDriver driver = null;

        try {
            // Set up ChromeDriver using WebDriverManager
            //WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // Set implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Load properties file
            fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\JAVAExclr\\src\\Data.properties");
            Properties p = new Properties();
            p.load(fis);

            // Read properties
            String url = p.getProperty("url");
            String username = p.getProperty("username");
            String password = p.getProperty("password");

            // Open URL
            driver.get(url);

            // Find and interact with elements
            WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='u_0_5_N5']"));

            userName.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();

            // Add some wait time to observe the result if necessary
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        } catch (IOException e) {
            System.out.println("Failed to load properties file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close file input stream: " + e.getMessage());
            }
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
