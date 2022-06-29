package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorEx2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
			
			//ChromeDriver cdriver =new ChromeDriver();//Specific
		 WebDriver driver =new ChromeDriver();//Generic way to launch brower
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
		 driver.get("https://www.demoblaze.com/");//open url
		 
		 List<WebElement> categories=driver.findElements(By.cssSelector(".list-group>a"));
		 System.out.println("Option count is :"+categories.size());
		 
		 for(int i=0;i<categories.size();i++) {
			 WebElement cat =categories.get(i);
			 System.out.println("Element of list is:"+cat.getText());
			 System.out.println(cat.isDisplayed());
			 System.out.println(cat.isEnabled());
		 }

	}

}
