import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		try
		{
			 WebDriver driver = new ChromeDriver();
			 Thread.sleep(1000);
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 driver.get("https://www.Amazon.com");
			 Thread.sleep(2000);
			 WebElement emailField= driver.findElement(By.className("inputtext"));
			 WebElement passwordField=driver.findElement(By.className("_9npi"));
			 emailField.sendKeys("sachin@gmail.com");
			 Thread.sleep(3000);
			 passwordField.sendKeys("sachin12345");
			 Thread.sleep(3000);
			 driver.close();
		
			}catch (Exception e) {
				System.out.println("e.getMessage");
				
			}

		}
	
	}


