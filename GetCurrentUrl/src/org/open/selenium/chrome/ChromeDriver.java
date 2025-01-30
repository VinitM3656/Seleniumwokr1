import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CompanyNamesFromTable {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        // Find the table
        WebElement table = driver.findElement(By.id("leftcontainer"));

        // Find all rows within the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through each row to extract company names
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 0) {
                String companyName = cells.get(0).getText(); // Assuming company names are in the first column
                System.out.println(companyName);
            }
        }

        // Close the browser
        driver.quit();
    }