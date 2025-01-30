package Practice99.Frames;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Allbrokenlinks {
	
	public static <ChromeDriver> void main(String[] args) {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	ChromeDriver driver = new ChromeDriver();
		driver.get("https://access.ez.works/");
		
		HttpURLConnection huc = null;
		List<WebElement> allHyperlinksList = driver.findElements(By.tagName("a"));
		for (WebElement hyperLink : allHyperlinksList) {
			String url = hyperLink.getAttribute("href");
			try {
				URL actualUrl = new URL(url);
				huc = (HttpURLConnection) actualUrl.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				int respCode = huc.getResponseCode();
				
				if (respCode >= 400) {
					System.out.println(url + " is a BROKEN link");
				} else {
					System.out.println(url + " is a VALID link");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		((Object) driver).quit();
	}
}

