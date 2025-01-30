package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String [] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://uitestpractice.com/Students/Switchto");
		
		//find Alert button and click action
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		
		
		
		driver.findElement(By.xpath("//button[@id='prompt']"));
		//switch to aler window, enter name
		
		driver.switchTo().alert().sendKeys("vinit");
		//accept alert
		
		driver.switchTo().alert().accept();
		
	}

}
