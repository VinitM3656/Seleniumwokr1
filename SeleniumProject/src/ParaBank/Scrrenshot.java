package ParaBank;
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scrrenshot {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

      
        WebDriver driver = new ChromeDriver();

        try {
          
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

           
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

          
            String screenshotPath = "D:\\samir gdb\\New folder\\screenshot.png";

           
            Files.copy(screenshotFile, new File(screenshotPath));

           
            System.out.println("Screenshot saved at: " + screenshotPath);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}
