package Repractice.Locators.Xpath;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class Alert {
public static void main(String[] args) {
try {
//WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
Thread.sleep(3000);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.
ofSeconds(10));
driver.get("D:\\MOVIES\\Selenium-LATEST\\alert.html");
Thread.sleep(3000);
driver.findElement(By.id("alert")).click();
Alert a = driver.switchTo().alert();
Thread.sleep(3000);
String text = a.getText();
System.out.println("The text is "+text);
a.accept(); //Click on OK button of the alert box
Thread.sleep(3000);
driver.quit();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}