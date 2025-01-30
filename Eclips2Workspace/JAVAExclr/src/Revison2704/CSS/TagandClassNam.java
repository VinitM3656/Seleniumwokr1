package Revison2704.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagandClassNam {

	
	public static void main(String[] args) {
		try {
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		webElement emailfield = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
}
