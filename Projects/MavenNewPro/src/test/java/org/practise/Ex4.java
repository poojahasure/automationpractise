package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		System.out.println("Page Title : "+driver.getTitle());
		System.out.println("Page Title length : "+driver.getTitle().length());
		
		String CurrentUrl=driver.getCurrentUrl();
		String expectedUrl="https://demosite.executeautomation.com/Login.html";
		
		if(CurrentUrl.equals(expectedUrl)) {
			System.out.println("Correct url");
		}else {
			System.out.println("InCorrect url");
		}
		
		WebElement Usernameinput=driver.findElement(By.name("UserName"));
		Usernameinput.sendKeys("execution");
		WebElement pwdinput=driver.findElement(By.name("Password"));
		pwdinput.sendKeys("admin");
		
		WebElement button=driver.findElement(By.name("Login"));
		button.click();
		
		System.out.println("Page Title : "+driver.getTitle());
		System.out.println("Page currenturl : "+driver.getCurrentUrl());
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.tagName("a"));
		logout.click();
		
		//driver.close();
		
	}

}
