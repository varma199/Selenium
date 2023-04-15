package java_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page Title  :   "+title);

	}

}
