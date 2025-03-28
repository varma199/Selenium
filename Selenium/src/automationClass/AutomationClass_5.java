package automationClass;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Frams
		 * switchTo().frame()--- to shift driver focus to frame
		 * switchTo().parentFrame();
		 */
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/frames");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String text_message = driver.findElement(By.xpath("//div[@id='framesWrapper']")).getText();
		System.out.println("text--->"+text_message);
		
		System.out.println("----- entering into fram 1--------------------------------");
		driver.switchTo().frame("frame1");
		
		WebElement text1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", text1);
		String simple_text = text1.getText();
		System.out.println("text1 ----> "+simple_text);
		
		
		try {
			String text_message2 = driver.findElement(By.xpath("//div[@id='framesWrapper']")).getText();
			System.out.println("text--->"+text_message2);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("-------------not able to accecc the text--------------");
		}
		
		System.out.println("----- switched to Parent --------------------------------");
		driver.switchTo().parentFrame();
		try {
			String text_message3 = driver.findElement(By.xpath("//div[@id='framesWrapper']")).getText();
			System.out.println("text--->"+text_message3);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("-------------not able to accecc the text 22222--------------");
		}
		
		System.out.println("----- entering into fram 2--------------------------------");
		driver.switchTo().frame("frame2");
		
		
		
		WebElement text2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", text2);
		String simple_text2 = text2.getText();
		System.out.println("text2 ---> "+simple_text2);
		try {
			String text_message3 = driver.findElement(By.xpath("//div[@id='framesWrapper']")).getText();
			System.out.println("text--->"+text_message3);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("-------------not able to accecc the text--------------");
		}
		
		
		driver.close();
		
		
		
		

	}

}
