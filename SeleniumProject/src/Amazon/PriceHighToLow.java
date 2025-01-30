package Amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class PriceHighToLow {

    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        searchbox.sendKeys("Iphone 13");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        
        List<WebElement> iphonePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        for (int i = 0; i < iphonePrices.size(); i++) {
            String text = iphonePrices.get(i).getText();
            System.out.println(text);
        }

       
        String[] iphone = {"59,900", "54,900", "59,900", "39,999", "61,900", "10,000"};
        Arrays.sort(iphone);

     
        System.out.println(Arrays.toString(iphone));

        
        driver.quit();
    }
}
