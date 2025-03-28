package automationClass;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationClass_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement double_click_btm  = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement right_click_btn  = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement click_btn = driver.findElement(By.xpath("//button[@id='rightClickBtn']/following::button"));
		
		
		Actions act = new Actions(driver); // creating an object for Actions class
		
		 Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", right_click_btn);
		Thread.sleep(3000);
		act.contextClick(right_click_btn).build().perform();
		

		
		String right_click_message = driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
		if(right_click_message.equalsIgnoreCase("You have done a right click")) {
			System.out.println("Right click worked successfully---->"+right_click_message);
		}else {
			System.err.println("Right click not worked");
		}
		
		//driver.navigate().refresh();
		Thread.sleep(3000);
		//js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", click_btn);
		
		act.moveToElement(click_btn).build().perform();
		act.click(click_btn).build().perform();
		Thread.sleep(3000);
		
		String click_message = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
		if(click_message.equals("You have done a dynamic click")) {
			System.out.println("Successfully clickon on click me button---->"+click_message);
		}else {
			System.err.println("not  clickon on click me button");
		}
		
		
		Thread.sleep(2000);
		act.moveToElement(double_click_btm).build().perform();
		act.doubleClick(double_click_btm).build().perform();
		
		String double_click_message = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		if(double_click_message.contains("double click")) {
			System.out.println("Succesfuly performed double click --->"+ double_click_message);
		}else {
			System.err.println("not performed double click");
		}
			
		
		driver.close();

	}

}
