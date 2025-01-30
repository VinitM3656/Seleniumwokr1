package Prachi;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLink {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        
        // Find all anchor elements
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        
        System.out.println("Total number of hyperlinks on the webpage: " + linkElements.size());
        
        // Print text of each hyperlink
        for (WebElement linkElement : linkElements) {
            System.out.println(linkElement.getText());
        }
        
        driver.close();
    }
}
