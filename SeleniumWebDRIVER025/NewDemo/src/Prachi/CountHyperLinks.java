package Prachi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {
	
	public static void main(String [] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		List<WebElement> linkElement = (List<WebElement>) driver.findElement(By.tagName("a"));
	System.out.println(" Total number of hyperlink is on webpage"+ linkElement.size());
		
	
	for(WebElement linkElement1 : linkElement) {
		System.out.println(linkElement1.getText());
		
	}
	
	driver.close();
		
		
	}
		

}
