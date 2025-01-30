import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowManipulationExample {
    public static void main(String[] args) {
        // Set ChromeDriver path (Update with your own driver path)
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Perform some actions...

        // Minimize window
        driver.manage().window().minimize();

       
        driver.quit();
    }
}
