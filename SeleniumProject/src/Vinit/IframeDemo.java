package Vinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");

       
        driver.switchTo().frame("moneyiframe");

        String nseindex = driver.findElement(By.id("nseindex")).getText();
        System.out.println(nseindex);

        
        driver.switchTo().defaultContent();
    }
}
