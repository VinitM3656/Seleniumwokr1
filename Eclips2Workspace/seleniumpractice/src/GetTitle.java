import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			String CurrentUrl = driver.getCurrentUrl();
			String pageSource =driver.getPageSource();
			
			String title = driver.getTitle();
			
			System.out.println(" the current title is ");
			
			System.out.println(" current url is"+ CurrentUrl);
			
			
			System.out.println(" page source code is");
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
	}}