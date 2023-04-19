package selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Checkboxes")).click();
		System.out.println("---------------------------------------------------Verifying navigated to check box page or not-------------------------------------------------------------");
		
		if(driver.findElement(By.id("checkboxes")).isDisplayed()) {
			System.out.println("navigated to Check box page successfully");
			System.out.println("Pass");
		}else {
			System.err.println("not navigted to Check box page");
			System.err.println("Fail");
		}
		System.out.println("---------------------------------------------------Printing check boxes names -------------------------------------------------------------");
		List<WebElement> cb = driver.findElements(By.id("checkboxes"));
		int num_of_checkboxes= cb.size();
		for(int i = 0; i<num_of_checkboxes;i++) {
			String cb_name = cb.get(i).getText();
			System.out.println(cb_name);
		}
		System.out.println("---------------------------------------------------selecting and verifying check box 1 -------------------------------------------------------------");
		WebElement chbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement chbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		chbox1.click();
		if(chbox1.isSelected()) {
			System.out.println("check box 1 selected");
		}else {
			System.err.println("check box 1 is not selected");
		}
		System.out.println("---------------------------------------------------un selecting and verifying check box 2-------------------------------------------------------------");
		chbox2.click();
		if(!chbox2.isSelected()) {
			System.out.println("check box 2 unselected");
		}else {
			System.err.println("check box 2 selected");
		}
		System.out.println("----------------------if check box 2 not seleted it will select check box 2 -------------------------------------------------------------");	
		
		if(!chbox2.isSelected()) {
			System.out.println("check box 2 unselected");
			chbox2.click();
			if(chbox2.isSelected()) {
				System.out.println("check box 2 selected");	
			}else {
				System.out.println("check box 2 not selected");
			}
			
		}
		
		driver.close();
	}

}
