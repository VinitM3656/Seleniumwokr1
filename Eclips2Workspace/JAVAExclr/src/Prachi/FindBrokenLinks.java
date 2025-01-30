package Prachi;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://newtours.demoaut.com");
        Thread.sleep(4000);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // Check if the URL is not null and not empty
            if (url != null && !url.isEmpty()) {
                URL linkURL = new URL(url);
                HttpURLConnection httpConn = (HttpURLConnection) linkURL.openConnection();
                httpConn.setConnectTimeout(2000);
                httpConn.connect();

                // Check if the HTTP response code is 4xx or 5xx, indicating a broken link
                if (httpConn.getResponseCode() >= 400) {
                    System.out.println(url + " - is a Broken Link");
                } else {
                    System.out.println(url + " - is a Valid Link");
                }
                httpConn.disconnect();
            } else {
                System.out.println("Empty or Null URL found");
            }
        }

        driver.quit();
    }
}
