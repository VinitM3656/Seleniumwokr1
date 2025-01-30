package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Find the element and get its tooltip
        String actualTooltip = driver.findElement(By.xpath("//input[@id='age']"))
                                      .getAttribute("title");

        // Expected tooltip
        String expectedTooltip = "we ask for your name only for statistical purposes";

        // Compare actual and expected tooltips
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        // Close the browser
        driver.quit();
    }
}
