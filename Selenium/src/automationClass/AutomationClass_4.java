package automationClass;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationClass_4 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * driver.switchTo().alert().accept(); //it will click /select on 'ok', 'accept'
		driver.switchTo().alert().dismiss();// it will on cancel button
		driver.switchTo().alert().getText(); //it will get the text in the alert
		driver.switchTo().alert().sendKeys("ravi"); // it will pass the data in aleter tet box
		
		 */
		
		//WebDriver driver = new ChromeDriver();
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act  = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click(); 
		Thread.sleep(3000);
		String tet1 = driver.switchTo().alert().getText();  //
		Thread.sleep(3000);
		System.out.println("1st text ---->"+tet1);
		driver.switchTo().alert().accept();
		
		
		WebElement element = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
		Thread.sleep(2000);
		act.click(element).build().perform();
		Thread.sleep(6000);
		String text2 = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		System.out.println("2bd text ---->"+text2);
		driver.switchTo().alert().accept();
		
		WebElement button3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", button3);
		button3.click();
		Thread.sleep(3000);
		String text3 = driver.switchTo().alert().getText();
		System.out.println(" Text 3 ---->"+text3);
		driver.switchTo().alert().dismiss();
		String confirm_Text = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		System.out.println("confirmation text when we clicked on ok in the alaret button-->"+confirm_Text);
		
		WebElement button4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", button4);
		button4.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Ravi Teja");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String promt_text = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println("given text --->"+ promt_text);
		
		
		
		
		
		
		
		driver.close();
		
		
	

	}

}
