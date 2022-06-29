package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEx4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		WebElement element =driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);//using escape of keyboard to avoid login
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);

		//***possible ways to refresh the browser
		//1.driver.navigate().refresh();
		//2.sendKeys(Keys.F5)
		//3.by hitting same url again
		//4.ctrl+R
	}

}
