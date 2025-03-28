package selenium_Basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Chrome {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
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
		
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\ravit\\git\\Selenium\\Selenium");

                //Copy file at destination

               // FileUtils.copyFile(SrcFile, DestFile);
		
		
		driver.close(); // --- to close current tab in the browser
		driver.quit(); //-------> to close entire browser / or to close all tabs or opened windows
		

		
		
	}

}
