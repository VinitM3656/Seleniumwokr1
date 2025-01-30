package ParaBank;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();

		
		driver.get("https://www.google.com/");
		System.out.println("first page: " + driver.getTitle());

		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println("second tab: " + driver.getTitle());

		
		Set <String> windowHandles=	driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0));
		System.out.println("first page: " + driver.getTitle());
		
		
		
		






	}

}