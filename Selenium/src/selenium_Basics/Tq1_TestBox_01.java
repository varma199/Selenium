package selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tq1_TestBox_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String firstName = "Ravi";
		String mail = "ravi@gmail.com";
		String address = "Hyderabad";
		String pAddress = " Koilkuntla";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/elements");
		//driver.findElement(By.xpath("//div[@class='header-text'][1]")).click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[1]")).click();
		
		System.out.println("----------Verifying navigated to text box page or not---------");
		String url =driver.getCurrentUrl();
		if(url.contains("text-box")) {
			System.out.println("Successfully navigated to Text box page");
			System.out.println("Pass");
		}else {
			System.err.println("not navigated to Text box page");
			System.err.println("Fail");
		}
		
		System.out.println("----------submitting valid data in all filds---------");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(mail);
		driver.findElement(By.id("currentAddress")).sendKeys(address);
		driver.findElement(By.id("permanentAddress")).sendKeys(pAddress);
		WebElement m = driver.findElement(By.xpath("//button[@id='submit']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", m);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		System.out.println("----------Verifying out put with submitted data---------");
		String output = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText();
		System.out.println(output);
		if(output.contains(firstName)&&output.contains(address)) {
			System.out.println("First name and address verifyed in Output");
			System.out.println("Pass");
		}else {
			System.out.println("First name and address not verifyed in Output");
			System.out.println("Fail");
			
			
			
		}
		
		driver.close();
		
		
		
		

	}

}
