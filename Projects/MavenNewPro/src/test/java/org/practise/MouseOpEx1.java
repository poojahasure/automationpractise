package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOpEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//chrome browser lauch
		
		driver.manage().window().maximize();//maximize 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//frame handling
		WebElement frame =driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		//create an instance of actions class by passing required browser instance to its constructor
		Actions act =new Actions(driver);
		List<WebElement>  ele=driver.findElements(By.cssSelector("ul#gallery>li"));//src is located
		WebElement target =driver.findElement(By.cssSelector("div#trash"));
		
		act.dragAndDrop(ele.get(0), target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(ele.get(1), target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(ele.get(2), target).build().perform();
		
	}

}
