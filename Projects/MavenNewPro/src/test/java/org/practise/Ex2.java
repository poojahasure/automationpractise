package org.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//launch new cg=hrome brower
		
		driver.get("https://www.facebook.com");//open the url
		
		String actualtitle =driver.getTitle();
		String Expectedtitle="Facebook – log in or sign up";
		
		if(actualtitle.equals(Expectedtitle)) {
			System.out.println("correct Title");
		}else {
			System.out.println("incorrect Title");
		}
		
		System.out.println("Page title :"+driver.getTitle());
		
		driver.close();
	}

}
