package org.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEx1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver cdriver =new ChromeDriver();//Specific
		 WebDriver driver =new ChromeDriver();//Generic way to launch brower
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     
		 driver.get("http://demo.automationtesting.in/Register.html");//open url
		 
		 WebElement skilldropdown =driver.findElement(By.cssSelector("select#Skills"));
		 
		 //***create an instance of select class and pass above element into its constructor
		 
		 Select selectskill =new Select(skilldropdown);
		 
		 //***check whether dropdown is multiselect dropdown or not
		 
		 System.out.println("is dropdown is allowing to select multiple options : "+ selectskill.isMultiple());
         
		 //***get default or already select option 
		 
//		 WebElement selectedoption=selectskill.getFirstSelectedOption();
//		 String selectedoptionname =selectedoption.getText();
//		 System.out.println("Already selected option name ="+selectedoptionname);
		 
		                        //or
		 System.out.println(selectskill.getFirstSelectedOption().getText());
		 
		 //get option count
		 List<WebElement> options =selectskill.getOptions();
		 System.out.println("Option count is :"+options.size());
		 
		 //Get dropdown option name
		 
		 for(int i=0;i<options.size();i++) {
			 System.out.println(options.get(i).getText());
		 }
		 
		 //select options from dropdown
		 selectskill.selectByIndex(4);
		 //or
		 selectskill.selectByValue("Backup Management");
		 //or
		 selectskill.selectByVisibleText("Analytics");
		 
	}

}
