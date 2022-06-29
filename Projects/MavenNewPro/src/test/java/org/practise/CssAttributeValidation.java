package org.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssAttributeValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement submitbutton=driver.findElement(By.id("submitbtn"));
		
		String fontcolor=submitbutton.getCssValue("color");
		String fontsize=submitbutton.getCssValue("font-size");
		String fontbackgroundcolor=submitbutton.getCssValue("background-color");
		
		System.out.println("fontcolor"+fontcolor);
		System.out.println("fontsize="+fontsize);
		System.out.println("fontbackgroundcolor="+fontbackgroundcolor);
	}

}
