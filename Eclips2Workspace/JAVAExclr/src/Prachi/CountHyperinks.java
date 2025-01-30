package Prachi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperinks {
	public static void main(String [] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement linkWElements= driver.findElement(By.tagName("a"));
		
		
		for(WebElement linkElement : linkElement) {
			System.out.println(linkElement.getText());
			
		}
		driver.close();
		
	}

}
