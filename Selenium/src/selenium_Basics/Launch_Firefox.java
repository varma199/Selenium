package selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) {
		String exp_Title = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
		String ext_Url= "https://www.yahoo.com/";
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		String act_Title = driver.getTitle();
		System.out.println("-----------------------------------Title----------------------------------------------------");
		if(act_Title.equals(exp_Title)) {
			System.out.println("page Title  :"+act_Title+"is displaying successfully");
			System.out.println("test case pass");
		}else {
			System.out.println("page Title  :"+act_Title+"is not displaying successfully");
			System.out.println("test case fail");
		}
		System.out.println("-----------------------------------URL----------------------------------------------------");
		String act_Url = driver.getCurrentUrl();
		if(act_Url.equals(ext_Url)) {
			System.out.println("page URL  :"+act_Url+"is displaying successfully");
			System.out.println("test case pass");
		}else {
			System.out.println("page URL  :"+act_Url+"is not displaying successfully");
			System.out.println("test case Fail");
		}
		driver.close();
		

	}

}
