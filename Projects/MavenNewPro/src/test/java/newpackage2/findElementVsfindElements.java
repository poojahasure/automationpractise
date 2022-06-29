package newpackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementVsfindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//findElement
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("xyz");
		
        WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println( ele.getText());
        
        WebElement searchbutton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	    //throws nosuchelementexception
        
        //findElements
       List< WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
       System.out.println(links.size());
       
       List< WebElement>Logo =driver.findElements(By.xpath("//img[@alt='nopcommece demo store']"));
       System.out.println(Logo.size());
       
       List< WebElement> elements=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
       //returns zero elements does not throw any exception
       
       System.out.println(elements.size());
        
        
        
        
        
	}

}
