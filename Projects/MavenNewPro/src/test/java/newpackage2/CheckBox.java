package newpackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
//		//1)select specific check box
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		 
		//2)select all check box
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println(checkboxes.size());
		//using for loop
//		for(int i=0;i<checkboxes.size();i++) {
//			
//			checkboxes.get(i).click();
//		}
		
		//using for each loop
		
//		for(WebElement chbox:checkboxes) {
//			chbox.click();
//		}
		
		//3)select multiple check box by choice
		
	/*	for(WebElement chbox:checkboxes) {
			String checkboxname=chbox.getAttribute("id");
			if(checkboxname.equals("monday") || checkboxname.equals("sunday")) {
				chbox.click();
			}
		}
		*/
		
		 //4)Select last 2 check box
		
		int total=checkboxes.size();
/*		
		for(int i=total-2;i<total;i++) {
			
			checkboxes.get(i).click();
		}
	*/	
		
		//5)select first 2 check box
		
		for(int i=0;i<total;i++) {
		
			if(i<2) {
             checkboxes.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
