package automationClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutomationClass_1 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * initilazation
		 * deleteAllCookies(); ---
		 * get() ----> launh the URL
		 * findElement()---> 
		 * click()
		 * sendKeys();
		 * getTitle()---- it will return title of the page ---> string
		 * getCurrentUrl()----> it will return current page url ---->String
		 * 
		 */
		//System.setProperty("WebDriver", ""))
		WebDriver driver =  new ChromeDriver(); //--- creating object for selenium web driver
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.name("q")).click();// --->  to click on search box
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("selenium");  // ----> to Enter data in text box
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		
		String title = driver.getTitle(); // -----> to get title of the page
		System.out.println("page Title  :   "+title);
		
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("page title  : "+title+"  displaying as per expected");
		}else {
			System.out.println("page title  : "+title+"  not  displaying as per expected");
		}
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();  // -----> to get URL of the page
		System.out.println("page url ----"+url);
		
		if(url.equalsIgnoreCase("https://www.google.com/")) {
			System.out.println("page URL  : "+url+"  displaying as per expected");	
		
		}else {
			System.out.println("page URL  : "+url+"  not displaying as per expected");
		}
		
		driver.close(); // --- to close current tab in the browser
		driver.quit(); //-------> to close entire browser / or to close all tabs or opened windows
		

		
		
	}

}
