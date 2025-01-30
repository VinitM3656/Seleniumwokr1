package Vinit;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
public class CountRadioButton {

    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total no. of radio button on web page: " + radioButtonList.size());
        driver.close();
    }
}
