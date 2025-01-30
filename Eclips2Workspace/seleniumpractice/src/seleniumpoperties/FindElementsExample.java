package seleniumpoperties;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(1000);
			driver.manage().window().maximize();
			
		driver.get("https://www.ezworks.ai/");
		
		String getTitle = driver.getTitle();
		String getUrl = driver.getCurrentUrl();
		String pagesource= driver.getPageSource();
		
		System.out.println(" we having all "+ getTitle+ " "+ getUrl+" "+ pagesource);
	
		List<WebElement> links =
				driver.findElements(By.tagName("a"));
				Iterator<WebElement> itr = links.iterator();
				while(itr.hasNext()) {
				System.out.println(itr.next().getText());
				}
				} catch (Exception e) {
				System.out.println(e);
				}
				}

}
