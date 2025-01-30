package seleniumpractice.WaitsInSelenium;

import java.time.Duration;
import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayAlllink {
    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in");
            List<WebElement> links = driver.findElements(By.tagName("a"));
            Iterator<WebElement> its = links.iterator();
            while (its.hasNext()) {
                System.out.println(its.next().getText());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
