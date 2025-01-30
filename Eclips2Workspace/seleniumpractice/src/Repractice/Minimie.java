
package Repractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Minimie {
	public static void main(String [] args) {
		try {
			
			
		
			ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.bookmyshow.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String getURl = driver.getCurrentUrl();
		Thread.sleep(1000);
		String SourceCode = driver.getPageSource();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.quit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
		


