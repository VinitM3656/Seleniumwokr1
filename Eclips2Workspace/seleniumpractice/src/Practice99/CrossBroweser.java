package Practice99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CrossBroweser {

    public static void main(String[] args) {
        // Define the browsers you want to test
        String[] browsers = {"chrome", "firefox", "edge"};

        for (String browser : browsers) {
            WebDriver driver = null;

            switch (browser) {
                case "chrome":
                    // Set the path to the ChromeDriver executable
                   // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    // Set the path to the GeckoDriver executable
                    //System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "edge":
                    // Set the path to the EdgeDriver executable
                   // System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver");
                    EdgeOptions edgeOptions = new EdgeOptions();
                    driver = new EdgeDriver(edgeOptions);
                    break;
                default:
                    System.out.println("Browser not supported");
                    break;
            }

            if (driver != null) {
                try {
                    // Perform the test
                    driver.get("https://www.ezworks.ai/");
                    
                    // Perform additional actions or assertions here
                    System.out.println("Title of the page: " + driver.getTitle());
                    
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close the browser
                    driver.quit();
                }
            }
        }
    }
}
