package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
	   String path=System.getProperty("user.dir");
	   System.out.println(path);
	   System.setProperty("webdriver.chrome.driver","E:\\Java setup\\Projects\\MavenNewPro\\driverfiles\\chromedriver.exe");
	   ChromeDriver obj =new ChromeDriver();
	   

	}

}
