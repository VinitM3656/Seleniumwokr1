package Practice99;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator; 
import java.util.List;

public class BrokenLinks {
   public static void main(String[] args) {

      //Create WebDriver instance and open the website.
      //System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.ezworks.ai/");
      
      String url="";
      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
      System.out.println("Total links on the Wb Page: " + allURLs.size());

      //We will iterate through the list and will check the elements in the list.
      Iterator<WebElement> iterator = allURLs.iterator();
      while (iterator.hasNext()) {
    	  url = iterator.next().getText();
    	  System.out.println(url);
      }
      
     //Close the browser session
      driver.quit();
    }
}