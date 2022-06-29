package org.practise;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		
       
       //Implicit wait 
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://demo.actitime.com/login.do");
       
       //Fluent wait
       Wait wait =new FluentWait(driver)
    		   .withTimeout(Duration.ofSeconds(50))
    		   .pollingEvery(Duration.ofSeconds(5))
    		   .ignoring(NoSuchElementException.class);
       
       WebElement element =driver.findElement(By.id("username"));
       wait.until(ExpectedConditions.elementToBeClickable(element));
       element.sendKeys("admin");
       
       
       WebElement element1 =driver.findElement(By.name("pwd"));
       wait.until(ExpectedConditions.elementToBeClickable(element1));
       element1.sendKeys("manager");
       
       WebElement element2 =driver.findElement(By.id("loginButton"));
       wait.until(ExpectedConditions.elementToBeClickable(element2));
       element2.click();
       
       driver.close();
       
	}

}
