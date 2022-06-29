package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOpEx3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//chrome browser lauch
		
		driver.manage().window().maximize();//maximize 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com");
		
		WebElement element =driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='_1kidPb']//span"));
		System.out.println(elements.size());
		

	}

}
