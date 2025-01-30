package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scrolling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.countries-often-world-com/flag-of-the-world.html");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

        WebElement flag = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));

        js.executeScript("arguments[0].scrollIntoView();", flag);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        driver.quit();
    }
}
