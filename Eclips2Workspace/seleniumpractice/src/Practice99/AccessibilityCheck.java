package Practice99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AccessibilityCheck {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the URL
            driver.get("https://www.ezworks.ai/");

            // Wait for the page to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Check for ARIA roles (common in screen reader accessible content)
            List<WebElement> ariaRoles = driver.findElements(By.xpath("//*[@role]"));
            System.out.println("Number of elements with ARIA roles: " + ariaRoles.size());
            for (WebElement element : ariaRoles) {
                System.out.println("Role: " + element.getAttribute("role") + " - Tag: " + element.getTagName());
            }

            // Check for elements with tabindex (common in keyboard navigation)
            List<WebElement> tabindexElements = driver.findElements(By.xpath("//*[@tabindex]"));
            System.out.println("Number of elements with tabindex: " + tabindexElements.size());
            for (WebElement element : tabindexElements) {
                System.out.println("Tabindex: " + element.getAttribute("tabindex") + " - Tag: " + element.getTagName());
            }

            // Additional checks can be added here for other accessibility attributes (e.g., aria-label, aria-labelledby)
            List<WebElement> ariaLabelElements = driver.findElements(By.xpath("//*[@aria-label]"));
            System.out.println("Number of elements with aria-label: " + ariaLabelElements.size());
            for (WebElement element : ariaLabelElements) {
                System.out.println("aria-label: " + element.getAttribute("aria-label") + " - Tag: " + element.getTagName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}



