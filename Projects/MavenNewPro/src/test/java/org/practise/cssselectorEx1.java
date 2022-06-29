package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorEx1 {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
					
					//ChromeDriver cdriver =new ChromeDriver();//Specific
      WebDriver driver =new ChromeDriver();//Generic way to launch brower
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
	  driver.get("https://www.demoblaze.com/");//open url
	  List<WebElement> phones=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	  
	  System.out.println("Number of phones present on home page :"+ phones.size());
	
	  for(WebElement element:phones) {
		  System.out.println(element.getText());
	  }
	  
	  driver.close();
					
	}

}
