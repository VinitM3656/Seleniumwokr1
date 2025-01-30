package Vinit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        
        WebElement button = driver.findElement(By.id("file-upload"));
        Actions act = new Actions(driver);
        
        // Click on the file upload button
        act.moveToElement(button).click().perform();
        
        try {
            // Provide the correct path to your file
            String filePath = "D://MOVIES//hello.txt";
            
        
            Runtime.getRuntime().exec("autoITScriptPath.exe " + filePath);
            
           
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        driver.quit();
    }
}
