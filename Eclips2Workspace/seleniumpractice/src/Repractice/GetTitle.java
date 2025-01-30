package Repractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    
    public static void main(String [] args) {
        
        try {
            
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Provide the path to chromedriver.exe
            
            WebDriver driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.get("https://www.bookmyshow.com");
            Thread.sleep(4000);
            String title = driver.getTitle();
            
            System.out.println("The title is: " + title);
            
            driver.quit(); // Close the browser after getting the title
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
