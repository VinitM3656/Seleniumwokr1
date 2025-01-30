package Vinit;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) {
        String expectedDay = "8";
        String expectedMonth = "July";
        String expectedYear = "2022";
        
        System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();

        while (true) {
            String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) {
                List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

                for (WebElement day : dayList) {
                    String calendarDay = day.getText();
                    if (calendarDay.equals(expectedDay)) {
                        day.click();
                        break;
                    }
                }

                break;
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }

        driver.quit();
    }
}
