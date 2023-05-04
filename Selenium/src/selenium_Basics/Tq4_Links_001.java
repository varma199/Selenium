package selenium_Basics;

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
	
	System.err.println("-----------------Verifying navigated to radio buttons page or not----------------");
	System.err.println("______________________________________________________________________");
	String url =driver.getCurrentUrl();
	if(url.contains("radio-button")) {
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

public static void Verify_links2() {
	System.err.println("----------------------------Verifying Links in the page -----------------------------------");
	System.err.println("______________________________________________________________________");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int NoOfLinks = links.size();
	
	for(int i = 4; i<=NoOfLinks;i++) {
		String link = links.get(i).getText();
		System.out.println("link "+i+"  :"+link);
		links.get(i).click();
		
		
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navigating_to_Links_page();
		print_all_links_id();
		Verify_links2();
		

	}

}
