package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
		
		//ChromeDriver cdriver =new ChromeDriver();//Specific
		WebDriver driver =new ChromeDriver();//Generic way to launch brower
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/");//open url
		
		System.out.println(driver.getTitle());//title of page
		System.out.println(driver.getTitle().length());//title length
		
		//check whether url is correct or not
		String ActualUrl =driver.getCurrentUrl();
		String ExpectedUrl="https://demo.actitime.com/";
		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Correct page");
		}else {
			System.out.println("InCorrect page");
		}
		
		
		WebElement Usernameinput=driver.findElement(By.id("username"));//element is located
		 Usernameinput.sendKeys("admin");
		 
		 WebElement passwordinput=driver.findElement(By.name("pwd")); 
		 passwordinput.sendKeys("manager");
		 
		 WebElement button=driver.findElement(By.id("loginButton")); 
		 
		 //Explicit Wait
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5000));
		 wait.until(ExpectedConditions.elementToBeClickable(button));
		 button.click();
		 
		 Thread.sleep(5000);
		 System.out.println(driver.getTitle());
		 
		// driver.close();
		
		
	}

}
