package newpackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinksEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		
		//Capture all links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
	/*	
		for(int i=0;i<=links.size();i++) {
			
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
	*/	
		//using for each loop 
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			
		}
		
	}

}
