package Vinit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;

public class OpenNewTabOrWindow {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("First page: " + driver.getTitle());

    
        driver.switchTo().newWindow(WindowType.WINDOW);



        driver.get("https://www.amazon.com");
        System.out.println("Second tab: " + driver.getTitle());

      
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handles = new ArrayList<String>(windowHandles);
        
      
        driver.close();

        
        driver.switchTo().window(handles.get(0));
        System.out.println("Back to the first tab: " + driver.getTitle());

       
        driver.quit();
    }
}
