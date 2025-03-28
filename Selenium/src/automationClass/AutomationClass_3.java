package automationClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationClass_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.google.com/");
		String title1 = driver.getTitle();
		System.out.println("Title 1"+title1);
		Thread.sleep(3000);
		
		driver.get("https://www.yahoo.com/");
		String title2 = driver.getTitle();
		System.out.println("Title 2 --->"+ title2);
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println("title 3 --->"+ title3);
		
		driver.navigate().forward();
		String title4 = driver.getTitle();
		System.out.println("title4--->"+ title4);
		
		

	}

}
