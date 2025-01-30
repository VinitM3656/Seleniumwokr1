
package Vinit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Amazon website
        driver.get("https://www.Flipkart.com/");

        // Find and click on the "Best Sellers" link
        WebElement bestSellersLink = driver.findElement(By.linkText("Mobiles"));
        bestSellersLink.click();

        // Optional: You can add more actions or verifications here

        // Close the browser window
        driver.quit();
    }
}
