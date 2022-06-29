package newpackage2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
		 //  ChromeDriver obj =new ChromeDriver();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println("Title"+ driver.getTitle());
		System.out.println("Title"+ driver.getPageSource());
		System.out.println("Title"+ driver.getCurrentUrl());
		
       //FirefoxDriver
//		System.setProperty("webdriver.gecko.driver","E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\geckodriver.exe");
//		 //  ChromeDriver obj =new ChromeDriver();
//		FirefoxDriver driver =new FirefoxDriver();
		//WebDriver driver =new FirefoxDriver();
	//	driver.get("https://www.amazon.com/");
		 
		
//		//edge
//		System.setProperty("webdriver.edge.driver","E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\msedgedriver.exe");
//		WebDriver driver =new EdgeDriver();
//		
//		driver.get("https://www.amazon.com/");
		
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver =new EdgeDriver();
		
	}

}
