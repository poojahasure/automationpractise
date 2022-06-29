package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOpEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//chrome browser lauch
		
		driver.manage().window().maximize();//maximize 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		//Instance of action class
		
		Actions action =new Actions(driver);
		
		driver.findElement(By.xpath("//a[text()=Create New Account]")).click();
		
		WebElement username =driver.findElement(By.name("firstname"));
		username.sendKeys("admin");
		
		//username.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		
		//or
		
		action.doubleClick(username).perform();
		username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
