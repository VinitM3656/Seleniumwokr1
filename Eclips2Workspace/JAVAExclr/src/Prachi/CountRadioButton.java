package Prachi;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://materializecss.com/radio-buttons.html");
        
        // Find all radio buttons
        List<WebElement> radioButtonList = driver.findElements(By.xpath("//span[normalize-space()='Yellow']"));
        
        System.out.println("Total number of radio buttons: " + radioButtonList.size());
        
        driver.close();
    }
}
