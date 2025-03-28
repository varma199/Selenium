package selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;

public class Tq3_RadioButtons {
		public static WebDriver driver = new ChromeDriver();
		
		static JavascriptExecutor js = (JavascriptExecutor)driver;
		
	
	public static void navigating_to_RadioButtons_page() {
		//WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
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
	}
	
	
	public static void select_yes_RadioButton() throws InterruptedException {
		System.err.println("-----------------Verify  yes radio button is seleted or not-----------------");
		System.err.println("_________________________________________________________________");
		WebElement rad_Yes = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		Actions act = new Actions(driver);
		act.click(rad_Yes);
		//js.executeScript("arguments[0].click();", rad_Yes);
		Thread.sleep(2000);
		
		//rad_Yes.click();
		
		if(rad_Yes.isSelected()) {
			System.out.println("Yes radio button is selected");
			System.out.println("Pass");
		}else {
			System.out.println("Yes radio button is not selected");
			System.out.println("Fail");
		}
		
	}
		public static void select_Imp_RadioButton() {
			System.err.println("-----------------Verifyb  impressive radio button is seleted or not----------------");
			System.err.println("_________________________________________________________________");
			WebElement rad_imp = driver.findElement(By.id("impressiveRadio"));
			js.executeScript("arguments[0].click();", rad_imp);
			if(rad_imp.isSelected()) {
				System.out.println("Yes radio button is selected");
				System.out.println("Pass");
			}else {
				System.out.println("Yes radio button is not selected");
				System.out.println("Fail");
			}
			
		
		}
		
		
		public static void verify_no_RadioButton() {
			System.err.println("-----------------Verifyb  No radio button ----------------");
			System.err.println("_________________________________________________________________");
			WebElement rad_no = driver.findElement(By.id("noRadio"));
			js.executeScript("arguments[0].click();", rad_no);
			if(!rad_no.isSelected()) {
				System.out.println("no radio button is not selected");
				System.out.println("Pass");
			}else {
				System.out.println("no radio button is  selected");
				System.out.println("Fail");
			}
		}
		
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		navigating_to_RadioButtons_page();
		select_yes_RadioButton();
		select_Imp_RadioButton();
		verify_no_RadioButton();
		driver.close();
	}

}
