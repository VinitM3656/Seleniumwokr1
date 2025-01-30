package seleniumpractice.MouseEvents;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvent1 {
    public static void main(String[] args) {
        try {
           // WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(4000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.edureka.co/");
            Thread.sleep(10000);
            WebElement browseCategories = driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']//span[contains(text(),'Categories')]"));
            WebElement frontEndDevelopment = driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle ga_top_category')][normalize-space()='Frontend Development']"));
            WebElement angularDevelopment = driver.findElement(By.xpath("//a[@class='ga_top_categories_course'][normalize-space()='Angular Certification Training Course']"));
            Actions a = new Actions(driver);
            a.moveToElement(browseCategories).perform();
            a.pause(Duration.ofSeconds(3));
            a.moveToElement(frontEndDevelopment).perform();
            a.pause(Duration.ofSeconds(3));
            a.moveToElement(angularDevelopment).perform();
            a.pause(Duration.ofSeconds(3));
            a.click().perform();
            Thread.sleep(3000);
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
