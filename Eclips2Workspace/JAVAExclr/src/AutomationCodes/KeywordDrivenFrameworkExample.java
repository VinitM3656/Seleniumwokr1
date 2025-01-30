package AutomationCodes;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class KeywordDrivenFrameworkExample {
public static void main(String[] args) {
try {
//WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(Duration.
ofSeconds(10));
FileInputStream fis = new FileInputStream(
"D:\\Eclips\\Eclips2Workspace\\JAVAExclr\\src\\AutomationCodes\\Locators.properties");
Properties p = new Properties();
p.load(fis);
String userNameLocator =
p.getProperty("locator.username");
String passwordLocator =
p.getProperty("locator.password");
String loginButtonLocator =
p.getProperty("locator.loginbtn");
String menuButtonLocator =
p.getProperty("locator.menubtn");
String logoutLocator =
p.getProperty("locator.logout");
driver.get("https://www.saucedemo.com");
WebElement userName =
driver.findElement(By.xpath(userNameLocator));
WebElement password =
driver.findElement(By.xpath(passwordLocator));
WebElement loginButton =
driver.findElement(By.xpath(loginButtonLocator));
userName.sendKeys("standard_user");
Thread.sleep(3000);
password.sendKeys("secret_sauce");
Thread.sleep(3000);
loginButton.click();
WebElement menuButton =
driver.findElement(By.xpath(menuButtonLocator));
WebElement logout =
driver.findElement(By.xpath(logoutLocator));
Thread.sleep(3000);
menuButton.click();
Thread.sleep(3000);
logout.click();
Thread.sleep(3000);
driver.quit();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}