package automationClass;

import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationClass_11 {
	public static WebDriver driver;
	
	public static void setUp() {
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	@BeforeTest
	public static void elementVisible() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		/*
		 * id, name, tag name, class name, css selector, link text, partial link text, xpath
		 */
		
		driver.findElement(By.xpath("//div[@class='example']/a[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.id("finish"))));
		
		WebElement element = driver.findElement(By.id("finish"));

		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		String text = element.getText();
		if(text.contains("Hello World!")) {
			System.out.println(" text displayed");
		}else {
			System.out.println("text not displayed");
		}
		
	}
	@Test
	public static void waitForAlaret() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicit  wait
		driver.get("https://demoqa.com/alerts");
		
		WebElement btn =  driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", btn);
		
		Actions act  = new Actions(driver);
		act.click(btn).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));///---> explicit wait
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String text2 = driver.switchTo().alert().getText();
	
		if(text2.equals("This alert appeared after 5 seconds")) {
			System.out.println("text displayed");
		} else {
			System.out.println("text not displayed");
		}
		

	}
	@Test
	public static void fluanntWaitMethod() {

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		
		driver.findElement(By.xpath("//div[@class='example']/a[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		FluentWait wait2 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		
				WebElement element = driver.findElement(By.id("finish"));

		
		
		String text = element.getText();
		if(text.contains("Hello World!")) {
			System.out.println(" text displayed");
		}else {
			System.out.println("text not displayed");
		}
		
	
	}
	@AfterTest

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		setUp();
//		elementVisible();
//		driver.close();
		setUp();
		waitForAlaret();
		driver.close();
		setUp();
		

	}

}
