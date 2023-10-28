package selenum_4;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.symmetric.Rijndael;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		//driver.manage().timeouts().implicitlyWait(20, )
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement btn = driver.findElement(By.xpath(""));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
		//fulent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
		
	}

}
