package SeleniumPractice;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LaunchBrowser {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.close();
	    }
	}


