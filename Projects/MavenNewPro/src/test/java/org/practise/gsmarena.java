package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
			
			//ChromeDriver cdriver =new ChromeDriver();//Specific
   WebDriver driver =new ChromeDriver();//Generic way to launch brower
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.gsmarena.com/");//open url

List<WebElement> phones = driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));

for(WebElement ele:phones) {
	System.out.println(ele.getText());
}

	}

}
