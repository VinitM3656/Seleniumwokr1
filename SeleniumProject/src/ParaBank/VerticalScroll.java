package ParaBank;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//Scroll vertically down by 500 pixels
		//js.executeScript("window.scrollBy(0,1000)"); 
		
		//scroll till visibilty of web element
		//WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		//js.executeScript("arguments[0].scrollIntoView();",element );

		//To scroll down the web page at the bottom of the page
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Horizontal scroll on the web page
		WebElement Element = driver.findElement(By.id("a7"));
		js.executeScript("arguments[0].scrollIntoView();",Element );
		
		
	}

}
