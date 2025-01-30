package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PartialLinkLocator {

    public static void main(String[] args) {
        try {
            // Set Chrome driver executable path
           // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

            // Initialize ChromeDriver
            ChromeDriver driver = new ChromeDriver();

            // Implicitly wait for 3 seconds (you can replace this with explicit waits as needed)
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to Facebook
            driver.get("https://www.facebook.com");
            
            Thread.sleep(3000);

            // Find elements matching partial link text "Forgotten"
            List<WebElement> forgotPasswordLinks = driver.findElements(By.partialLinkText("Forgotten"));

            // Print the count of found links
            System.out.println("Number of 'Forgotten' links found: " + forgotPasswordLinks.size());

            // Close the browser
            driver.quit();

        } catch (Exception e) {
            // Print any exception that occurs
            System.out.println(e.getMessage());
        }
    }
}
