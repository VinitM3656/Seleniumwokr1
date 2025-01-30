import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {
		try {
		WebDriver driver = new ChromeDriver();

		
		Thread.sleep(5000);
		driver.get("https://web.sensibull.com/positions");
		String title = driver.getTitle();
		System.out.println("The title is"+title);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}



	}
}

	

