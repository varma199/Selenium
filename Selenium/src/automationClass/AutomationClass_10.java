package automationClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationClass_10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				driver.get("https://demoqa.com/elements");
				//driver.findElement(By.xpath("//div[@class='header-text'][1]")).click();
				driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[3]")).click();
				
				System.err.println("-----------------Verifying navigated to radio buttons page or not----------------");
				System.err.println("_________________________________________________________________");
				String url =driver.getCurrentUrl();
				if(url.contains("radio-button")) {
					System.out.println("Successfully navigated to radio-button page");
					System.out.println("Pass");
				}else {
					System.err.println("not navigated to radio-button page");
					System.err.println("Fail");
				}
				
				
				System.err.println("-----------------Verify  yes radio button is seleted or not-----------------");
				System.err.println("_________________________________________________________________");
				WebElement rad_Yes = driver.findElement(By.xpath("//input[@id='yesRadio']"));
				//Actions act = new Actions(driver);
				//act.click(rad_Yes);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", rad_Yes);
				//rad_Yes.click();
				Thread.sleep(2000);
				
				//rad_Yes.click();
				
				if(rad_Yes.isSelected()) {
					System.out.println("Yes radio button is selected");
					System.out.println("Pass");
				}else {
					System.out.println("Yes radio button is not selected");
					System.out.println("Fail");
				}
				
				WebElement impressive = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
				if(impressive.isEnabled()) {
					System.out.println(" impressive radio button is enable");
				}else {
					System.out.println(" impressive radio button is  not enable");
				}
				
				if(!impressive.isSelected()){ 
					System.out.println(impressive.isSelected());
					System.out.println(!impressive.isSelected());
					System.out.println("Impressive radio button is not selected");
					System.out.println("pass");
				}else {
					System.out.println("Impressive radio button is selected");
					System.out.println("Fail");
				}
				
				WebElement no_radio = driver.findElement(By.xpath("//input[@id='noRadio']"));
				
				if(!(no_radio.isEnabled())) {
					System.out.println(" No radio button not enable");
					System.out.println("pass");
				} else {
					System.out.println(" no radio button is  Enable");
					System.out.println("Fail");
				}
				Thread.sleep(3000);
				js.executeScript("arguments[0].click();", impressive);
				//impressive.click();
				if(impressive.isSelected()) {//-----> true ----> if block ; flase----> else block
					System.out.println("impressive is selected");
					System.out.println("pass");
				}else {
					System.out.println("impressive is not selected");
					System.out.println("Fail");
				}
				
				if(!rad_Yes.isSelected()) {
					System.out.println("yes radio button is un selected");
					System.out.println(!rad_Yes.isSelected());
					System.out.println("pass");
				} else {
					System.out.println("yes radio button is selected");
					System.out.println(!rad_Yes.isSelected());
					System.out.println("Fail");
				}


	}

}
