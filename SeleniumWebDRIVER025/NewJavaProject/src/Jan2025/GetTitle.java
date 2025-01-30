package Jan2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	 public static void main(String[] args) {
	 try {
	// WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 Thread.sleep(5000);
	 driver.get("https://www.bookmyshow.com");
	 String title = driver.getTitle();
	 System.out.println("The title is "+title);
	 } catch (Exception e) {
	 System.out.println(e.getMessage());
	 }
	 }
	 }
