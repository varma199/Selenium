package selenum_4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoke {
	public static WebDriver driver;
	public static WebDriver setUpBrowser(String browser_value, String url) {
		
		if(browser_value.equals("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome browser invoked");
		}else if (browser_value.equals("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Fire fox broser invoked");
		}else if(browser_value.equals("Edge")){
			driver = new EdgeDriver();
			System.out.println("Microsoft Edge driver invked");
		}else {
			System.out.println("Provide valid browser value");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
		}
	
	public static void tearDown() {
		if(!driver.equals(null)) {
			driver.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpBrowser("Firefox", "https://www.google.com/");
		tearDown();
		setUpBrowser("Chrome", "https://www.google.com/");
		tearDown();
		setUpBrowser("Edge", "https://www.google.com/");
		tearDown();
	}

}
