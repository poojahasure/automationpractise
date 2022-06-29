package org.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		String path=".\\driverfiles\\chromedriver.exe";
		String path2=System.getProperty("user.dir")+path;
		System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		
		String actualurl=driver.getCurrentUrl();
		String Expectedurl= "https://demo.actitime.com/";
		
		if(actualurl.contains(Expectedurl)) {
			System.out.println("Correct ");
		}else {
			System.out.println("incorrect");
		}
		driver.close();

	}

}
