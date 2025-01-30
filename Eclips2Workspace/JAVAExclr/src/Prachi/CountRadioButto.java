package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountRadioButto {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://materializecss.com/radio-buttons.html");

        List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("Total number of radio buttons: " + radioButtonList.size());
        driver.close();
    }
}
