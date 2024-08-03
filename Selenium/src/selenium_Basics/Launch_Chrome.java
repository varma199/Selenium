package selenium_Basics;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page Title  :   "+title);
		
		
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("page title  : "+title+"  displaying as per expected");
		}else {
			System.out.println("page title  : "+title+"  not  displaying as per expected");
		}
		
		String url = driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://www.google.com/")) {
			System.out.println("page URL  : "+url+"  displaying as per expected");
			
			
		
		}else {
			System.out.println("page URL  : "+url+"  not displaying as per expected");
		}
		
		driver.close();

		
		
	}

}
