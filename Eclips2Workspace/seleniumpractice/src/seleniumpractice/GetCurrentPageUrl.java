package seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetCurrentPageUrl {
	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();
			ChromeDriver driver1 = new ChromeDriver();
			Thread .sleep(3000);
			driver1.get("https://www.flipkart++-+.coms/");
			String currentURL =driver1.getCurrentUrl();
			System.out.println("Current URL -"+currentURL);
		}
catch(Exception e) {
	System.out.println("e.getMessage");
}
	}

}
