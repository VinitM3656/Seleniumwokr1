package seleniumpractice.MouseEvents;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseEvent2 {
public static void main(String[] args) {
try {
//WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
Thread.sleep(3000);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.
ofSeconds(10));
driver.get("https://www.google.com");
WebElement searchBox =
driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
Actions a = new Actions(driver);
a.moveToElement(searchBox).click().perform();
a.pause(Duration.ofSeconds(3));
a.sendKeys("ExcelR").perform();
for (int i = 0; i < 4; i++) {
a.pause(Duration.ofSeconds(3));
a.keyDown(Keys.DOWN).perform();
}
a.keyDown(Keys.ENTER).perform();
Thread.sleep(3000);
driver.quit();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}