package ParaBank;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		System.out.println("Total no. of radio button on web page:" + radioButtonList.size());
		
		
		driver.close();
	}

}