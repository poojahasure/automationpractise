package org.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
		
		//ChromeDriver cdriver =new ChromeDriver();//Specific
		WebDriver driver =new ChromeDriver();//Generic way to launch brower
		driver.get("https://demo.actitime.com/");//open url
		
		

	}

}
