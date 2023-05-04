package selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tq2_Checbox_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/elements");
		//driver.findElement(By.xpath("//div[@class='header-text'][1]")).click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[2]")).click();
		
		System.out.println("----------Verifying navigated to text box page or not---------");
		System.err.println("_________________________________________________________________");
		String url =driver.getCurrentUrl();
		if(url.contains("checkbox")) {
			System.out.println("Successfully navigated to checkbox page");
			System.out.println("Pass");
		}else {
			System.err.println("not navigated to checkbox page");
			System.err.println("Fail");
		}
		System.out.println("----------_________Selecting and verifying checkboxe_______---------");
		System.err.println("_________________________________________________________________");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
		driver.findElement(By.xpath("//label[@for='tree-node-desktop']/span[1]")).click();
		String results1 = driver.findElement(By.id("result")).getText();
		System.out.println("Restuls 1  :   "+results1);
		if(results1.contains("desktop")) {
			System.out.println("System selected Desktop check box");
			System.out.println("Pass");
		}else {
			System.out.println("System not selected Desktop check box");
			System.out.println("Fail");
		}
		
		System.out.println("----------___________Selecting and verifying checkboxe________---------");
		System.err.println("_________________________________________________________________");
		driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='tree-node-office']/span[1]")).click();
		String results2 = driver.findElement(By.id("result")).getText();
		System.out.println("Restuls 2  :   "+results2);
		if(results2.contains("desktop")&&results2.contains("office")) {
			System.out.println("System selected Desktop check box");
			System.out.println("Pass");
		}else {
			System.out.println("System not selected Desktop  and Office check box");
			System.out.println("Fail");
		}
		
		System.out.println("----------_____Selecting and verifying checkboxe__________---------");
		System.err.println("_________________________________________________________________");
		driver.findElement(By.xpath("(//button[@title='Toggle'])[6]")).click();
		driver.findElement(By.xpath("//label[@for='tree-node-wordFile']/span[1]")).click();
		driver.findElement(By.xpath("//label[@for='tree-node-excelFile']/span[1]")).click();
		String results3 = driver.findElement(By.id("result")).getText();
		System.out.println("Restuls 3  :   "+results3);
		if(results3.contains("desktop")&&results3.contains("office")&&results3.contains("wordFile")&&results3.contains("excelFile")) {
			System.out.println("System selected Desktop , Office, WordFile and Excel File check boxes");
			System.out.println("Pass");
		}else {
			System.out.println("System not selected Desktop  and Office check box");
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		System.out.println("----------_____unSelecting and verifying checkboxe__________---------");
		System.err.println("_________________________________________________________________");
		driver.findElement(By.xpath("//label[@for='tree-node-wordFile']/span[1]")).click();
		driver.findElement(By.xpath("//label[@for='tree-node-excelFile']/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='tree-node-office']/span[1]")).click();
		String results4 = driver.findElement(By.id("result")).getText();
		System.out.println("Restuls 4  :   "+results4);
		if(!(results4.contains("wordFile")&&results4.contains("excelFile")&&results4.contains("office"))) {
			System.out.println("System unselected  Office, WordFile and Excel File check boxes");
			System.out.println("Pass");
		}else {
			System.out.println("System not selected Desktop  and Office check box");
			System.out.println("Fail");
		}
	}
	
	
}
