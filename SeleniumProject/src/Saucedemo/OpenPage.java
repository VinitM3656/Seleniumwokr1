
package Saucedemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPage{

	public static void main(String[] args) {
		try {
		WebDriver driver = new ChromeDriver();

		
		Thread.sleep(5000);
		driver.get("https://www.saucedemo.com/");
		String title = driver.getTitle();
		System.out.println("The title is"+title);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}



	}
}

	

