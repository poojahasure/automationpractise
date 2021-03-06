package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardopEx2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all=ctrl +a
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));//copy the content
		
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the content
		
		

	}

}
