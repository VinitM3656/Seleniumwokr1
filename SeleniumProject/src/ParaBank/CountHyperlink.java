package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List; // Add import statement for List

public class CountHyperlink {

    public static void main(String[] args) {
        // launch chrome browser
        // System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe"); // Adjust the path
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // launch web page https://www.calculator.net/
            driver.get("https://parabank.parasoft.com/parabank/index.htm/");

            List<WebElement> linkElements = driver.findElements(By.tagName("a"));

            System.out.println("Total links on webpage: " + linkElements.size());

            for (WebElement el : linkElements) {
                System.out.println(el.getText());
            }

            driver.quit(); // Close the browser at the end

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
