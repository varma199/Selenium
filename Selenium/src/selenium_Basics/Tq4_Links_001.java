package selenium_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tq4_Links_001 {
	
	public static WebDriver driver = new ChromeDriver();
	
	static JavascriptExecutor js = (JavascriptExecutor)driver;
	

public static void navigating_to_Links_page() {
	//WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://demoqa.com/elements");
	//driver.findElement(By.xpath("//div[@class='header-text'][1]")).click();
	WebElement linktab = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[6]"));
	//WebElement m = driver.findElement(By.xpath("//button[@id='submit']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", linktab);
	driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[6]")).click();
	
	System.err.println("-----------------Verifying navigated to links page or not----------------");
	System.err.println("______________________________________________________________________");
	String url =driver.getCurrentUrl();
	if(url.contains("links")) {
		System.out.println("Successfully navigated to radio-button page");
		System.out.println("Pass");
	}else {
		System.err.println("not navigated to radio-button page");
		System.err.println("Fail");
	}
}



public static void print_all_links_id() {
	System.err.println("----------------------------------Printing all links--------------------------------------------");
	System.err.println("______________________________________________________________________");
List<WebElement> links = driver.findElements(By.tagName("a"));
int NoOfLinks = links.size();

for(int i = 0; i<NoOfLinks;i++) {
	
	String link = links.get(i).getText();
	System.out.println("link "+i+"  :"+link);
	
}
}

public static void Verify_links2() throws InterruptedException {
	System.err.println("----------------------------Verifying Links in the page -----------------------------------");
	System.err.println("______________________________________________________________________");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int NoOfLinks = links.size();
	
	for(int i = 4; i<=NoOfLinks-1;i++) {
		String link = links.get(i).getText();
		System.out.println("link "+i+"  :"+link);
		links.get(i).click();
		Thread.sleep(2000);
		WebElement res = driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", res );
		String link_text = driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).getText();
		System.out.println(link_text);
		String status_code = driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).getText();
		
		if(link.equals(link_text)) {
			System.out.println("Link Verifyed and the status code is :"+status_code);
			System.out.println("Pass");
		}else {
			System.out.println("Link not verifyed");
			System.out.println("Fail");
		}
		
	}	
}
public static void n_ew_window() {
	System.err.println("----------------------------Verifying lik if it open in new window -----------------------------------");
	System.err.println("______________________________________________________________________");
	driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
	ArrayList<String> window_ids= new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(window_ids.get(1));
	String ur2 = driver.getCurrentUrl();
	if(ur2.equals("https://demoqa.com/")){
		System.out.println("switched to new window");
		System.out.println("Pass");
	}else {
		System.err.println("not switched to new window");
		System.out.println("Fail");
	}
	driver.switchTo().window(window_ids.get(0));
	String ur1= driver.getCurrentUrl();
	if(!ur1.equals("https://demoqa.com/")) {
		System.out.println("driver switched to previous window");
		System.out.println("Pass");
	}else {
		System.out.println("driver not switched to previous window");
		System.out.println("Fail");
	}
}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		navigating_to_Links_page();
		print_all_links_id();
		n_ew_window();
		Verify_links2();
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
