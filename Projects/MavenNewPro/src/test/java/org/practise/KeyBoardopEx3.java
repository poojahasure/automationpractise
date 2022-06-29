package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardopEx3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		WebElement element =driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);//using escape of keyboard to avoid login
	
		// for page scrolling
		for(int i=0;i<10;i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
		}
		Thread.sleep(1500);
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));//directly goto button of the page
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));//directly goto top of the page
		

	}

}
