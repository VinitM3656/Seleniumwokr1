package seleniumpractice.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class CrossBrowser {
WebDriver driver;
@BeforeMethod
@Parameters({"browser"})
void beforeMethod(String browser) {
if(browser.equals("chrome")) {
//WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
} else if(browser.equals("firefox")) {
//WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
} else if(browser.equals("edge")) {
//WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
}
}
@AfterMethod
void afterMethod() {
driver.quit();
}
@Test
public void testCase1() {
try {
Thread.sleep(3000);
// driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.saucedemo.com/");
driver.findElement(By.id("username")).sendKeys("standard_user");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("secret_sauce");
Thread.sleep(2000);
driver.findElement(By.id("login-button")).click();
Thread.sleep(2000);
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}