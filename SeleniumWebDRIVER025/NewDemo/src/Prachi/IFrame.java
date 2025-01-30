package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	public static void main(String [] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
		
		driver.switchTo().frame(iframeElement);
		
		driver.findElement(By.linkText("org.openqa.slenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.linkText("Alert")).click();
		
		driver.switchTo().defaultContent();
		int noOfiframes = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("no .of iframes:"+ noOfiframes);
	}

}
