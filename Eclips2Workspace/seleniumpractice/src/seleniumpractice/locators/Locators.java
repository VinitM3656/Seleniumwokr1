package seleniumpractice.locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Locators {
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
            Thread.sleep(1000);
            WebElement  phonenumberfiled = driver.findElement(By.id("phonenumber"));
            WebElement passwordFiled =driver.findElement(By.id("password"));
            Thread.sleep(4000);
            phonenumberfiled.sendKeys("9876567898");
            Thread.sleep(1000);
            passwordFiled.sendKeys("vinit 123");
            
            Thread.sleep(2000);
            driver.close();
            
            
            
            
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
