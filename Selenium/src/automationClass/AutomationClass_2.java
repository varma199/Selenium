
package automationClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class AutomationClass_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * 1- getAttribute
		 * 2- getText
		 * 3//-getCssValue
		 * 4-switchTo
		 * 		
		 * maximize() ---> to maximaize the window
		 * implicitlyWait()---> wait for webelements
		 * navigate().back();--- navigate to previous page
		 * navigate().forward();----> navigate to forward page
		 * getAttribute("name of the attribute")-----> returen attribute value ----> String 
		 * getText()------> it will return the text value ---> String
		 */
		
		WebDriver driver =  new ChromeDriver(); //--- creating object for selenium web driver
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
		
		
		
		
		
		driver.get("https://www.google.com/");
		String str =  driver.findElement(By.name("q")).getAttribute("id");
		System.out.println("valur of id "+ str);
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		String text =  driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println("text-----"+text);
		
		// 
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		
		
		driver.close();
		
		
		
		
		
		
		

	}

}
