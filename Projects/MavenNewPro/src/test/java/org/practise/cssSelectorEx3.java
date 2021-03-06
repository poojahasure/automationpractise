package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorEx3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
		
		//ChromeDriver cdriver =new ChromeDriver();//Specific
	 WebDriver driver =new ChromeDriver();//Generic way to launch brower
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
	 driver.get("https://www.google.com");//open url
	 
	 driver.findElement(By.name("q")).sendKeys("testing");
	 
	 Thread.sleep(5000);
	 
	 List<WebElement> categories=driver.findElements(By.cssSelector("div.wM6W7d>span"));
	 System.out.println("count of suggestions : "+categories.size());
	 for(WebElement ele :categories) {
		 System.out.println(ele.getText());
	 }
     
	}

}
