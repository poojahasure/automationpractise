package newpackage2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();//call to chrome browser
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//full page ScreenShot
/*        TakesScreenshot ts =( TakesScreenshot)driver;//typecast
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg =new File(".\\screenshots\\homepage.png");
        
        FileUtils.copyFile(src,trg);
        driver.close();
        */
		
		//screenshot of section
/*		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=section.getScreenshotAs(OutputType.FILE);
        File trg =new File(".\\screenshots\\feature.png");
        
        FileUtils.copyFile(src,trg);
        driver.close();
        */
        
        
        //screenshot of specific webelement
        WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
        File trg =new File(".\\screenshots\\logo.png");
        
        FileUtils.copyFile(src,trg);
        
        driver.close();
	}

}
