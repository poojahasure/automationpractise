package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarEx1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://redbus.com");
		
		driver.findElement(By.cssSelector("button.sc-jTzLTM.bfMZDh")).click();
		
		WebElement from =driver.findElement(By.id("src"));
		from.click();
		from.sendKeys("pune");
		
		WebElement to =driver.findElement(By.id("dest"));
		to.click();
		to.sendKeys("goa");
		
		WebElement date =driver.findElement(By.id("onward_cal"));
		date.click();
		WebElement arrow =driver.findElement(By.id("Layer_1"));
		arrow.click();
		

	}

}
