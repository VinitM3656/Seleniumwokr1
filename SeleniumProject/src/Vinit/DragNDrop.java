package Vinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.dhtmlgoodies.com/script/drag-drop-custom/demo-drag-drop-3.html");

        WebElement source = driver.findElement(By.id("box6"));
        WebElement target = driver.findElement(By.id("box106"));

        Actions act = new Actions(driver);

    
        act.dragAndDrop(source, target).perform();

      
        driver.quit();
    }
}
