package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DragDrop {
    public static void main(String[] args) {
        // Setting the system property for ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Creating a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the registration page
        driver.get("https://www.opencart.com/index.php?route=account/register");

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.id("input-country"));

        // Create a Select object
        Select select = new Select(dropdown);

        // Check if dropdown is multiple
        if (select.isMultiple()) {
            System.out.println("Dropdown is multiple");
        } else {
            System.out.println("Dropdown is not multiple");
        }

        // Get all options of the dropdown
        List<WebElement> allDropdownOptions = select.getOptions();

        // Print the total number of options
        System.out.println("Total options: " + allDropdownOptions.size());

        // Print text of each option
        for (WebElement option : allDropdownOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
