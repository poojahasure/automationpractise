package newpackage2;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkEx {

	public static void main(String[] args) throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int brokenlinks =0;
		
		for(WebElement element:links) {
			
			String url=element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("url is empty");
				continue;
			}
			
			URL link =new URL(url);
			
			try {
				HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400) {
					System.out.println(httpconn.getResponseCode()+url+ "is" +"   brokenlink");
					brokenlinks++;
				}
				else {
					System.out.println(httpconn.getResponseCode()+url+ "is" +"   Validlink");//
				}
			}
			catch(Exception e) {
				
			}
			
		}
		System.out.println("Total broken Links "+ brokenlinks);
		
	}

}
