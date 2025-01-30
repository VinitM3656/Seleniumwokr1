package Repractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentSourceCode {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.get(" https://www.google.com");
			Thread.sleep(2000);
			String SourceCode = driver.getPageSource();
			System.out.println(" the source code is "+ SourceCode);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
Y