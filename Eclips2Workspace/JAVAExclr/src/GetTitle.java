import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.bookmyshow.com");
			String title= driver.getTitle();
			
			System.out.println("the title is "+ title);
			
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
