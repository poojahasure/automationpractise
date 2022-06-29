package newpackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jquery-contextmenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
	//	WebElement button =driver.findElement(By.xpath);
		
		

	}

}
