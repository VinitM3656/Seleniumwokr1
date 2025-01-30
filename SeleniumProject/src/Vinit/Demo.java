package Vinit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the webpage: " + linkElements.size());
        for (WebElement e1 : linkElements) {
            System.out.println(e1.getText());
        }
        driver.close();
    }
}
