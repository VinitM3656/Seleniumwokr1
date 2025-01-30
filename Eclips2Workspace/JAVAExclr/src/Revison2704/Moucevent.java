package Revison2704;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moucevent {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.javatpoint.com/");
			Thread.sleep(2000);
			WebElement Home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
			WebElement Python = driver.findElement(By.xpath("//div[@class='ddsmoothmenu']//ul//li//a[@href='python-tutorial'][normalize-space()='Python']"));
			WebElement Java = driver.findElement(By.xpath("//div[@class='ddsmoothmenu']//ul//li//a[@href='java-tutorial'][normalize-space()='Java']"));
			Actions a = new Actions(driver);
			a.moveToElement(Home).perform();
			a.pause(Duration.ofSeconds(2));
			a.moveToElement(Python).perform();
			a.pause(Duration.ofSeconds(2));
			a.moveToElement(Java).perform();
			a.pause(Duration.ofSeconds(1));
			
			a.click().perform();
			Thread.sleep(2000);
			driver.quit();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
