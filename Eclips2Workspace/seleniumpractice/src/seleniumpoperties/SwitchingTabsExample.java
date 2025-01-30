package seleniumpoperties;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabsExample {
	
    public static void main(String [] args) {
        WebDriver driver = null;
        try {
            // Initialize the ChromeDriver
            driver = new ChromeDriver();

            // Maximize the window and set timeouts
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Load the local HTML file
            driver.get("C:\\Users\\vinit\\Desktop\\Old Firefox Data\\j1o3lxfa.default-1692292812941");

            // Wait for 2 seconds
            Thread.sleep(2000);

            // Click the link to open a new tab/window
            driver.findElement(By.linkText("Click here for page 2")).click();

            // Get all window handles
            Set<String> allIds = driver.getWindowHandles();
            ArrayList<String> al = new ArrayList<>(allIds);

            // Switch to the new tab/window
            driver.switchTo().window(al.get(1));

            // Click the link on the new page
            driver.findElement(By.linkText("Click here for page 3")).click();

            // Wait for 3 seconds
            Thread.sleep(3000);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                // Quit the driver
                driver.quit();
            }
        }
    }
}
