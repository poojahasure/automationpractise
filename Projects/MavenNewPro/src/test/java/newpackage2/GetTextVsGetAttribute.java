package newpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		 WebElement emailinputbox=driver.findElement(By.id("Email"));
//		 emailinputbox.clear();
//		 emailinputbox.sendKeys("adm123@gmail.com");
//		 
		 //Capturing text from inputbox
		 
		 System.out.println("result of getAttribute :"+ emailinputbox.getAttribute("value"));
		 System.out.println("result of getText() :"+ emailinputbox.getText());
		
		 //Login button
		 WebElement button =driver.findElement(By.className("button-1 login-button"));
		 System.out.println(button.getAttribute("type"));
		 System.out.println(button.getText());
	}
	

}
