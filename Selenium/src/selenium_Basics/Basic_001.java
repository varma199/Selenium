package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_001 {

	public static void main(String[] args) throws InterruptedException {
		//navigations
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.id("root_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.findElement(By.id("identifierId")).sendKeys("varma042@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		//.click() method used for to click on link or check box or radio button
		//sendKeys() method used for to send keys to text box
		//navigate().back() method used for to move to previous page
		//navigate().forward() method used for to move next page
		//navigate().refresh() method used to refresh the current page
		//findElement() method used to identify elements in web page
		
		
	}

}
