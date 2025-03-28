package automationClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomationClass_12 {
	
	/*
	 * Tables
	 * is table is displaying or not
	 * all heading are displaying or not
	 * id data displaying or no
	 * is sorting is working or not
	 * 
	 * 
	 */
	
	public static void verifyingTable1() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("tables")) {
			System.out.println("Successfully navigated to tables page");
			System.out.println("pass");
		}else {
			System.out.println("not  navigated to tables page");
			System.out.println("Fail");
		}
		
		//is table is displaying or not
		WebElement table1 = driver.findElement(By.id("table1"));
		WebElement table2 = driver.findElement(By.id("table2"));
		
		if(table1.isDisplayed() && table2.isDisplayed()) { //AND---> TURE , OR ,NOT
			System.out.println("Tables are displaying successfully");
			System.out.println("Pass");
		} else {
			System.out.println("Tables are not displaying successfully");
			System.out.println("Fail");
		}
		
		//all headingS are displaying or not
		
		String[] exp_headers = {"Last Name", "First Name",  "Email", "Due", "Web Site", "Action"};
		
		List<WebElement> headers_list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		String[] act_headers = {};
		boolean headersMatch = true;
		for(int i = 0; i<=headers_list.size()-1; i++) {
			String temp = headers_list.get(i).getText();
			if(temp.equals(exp_headers[i])) {
			System.out.println("mateched header value --->"+temp);
				headersMatch = true;
				
			}else {
				headersMatch = false;
				System.out.println("not mateched header value --->"+temp);
			}
			
		}
		
		Assert.assertTrue(headersMatch);
		
//is sorting is working or not
		driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th[1]")).click();
		
		List<WebElement> lastName_webelements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		
		driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th[1]")).click();
		
		List<String> orginal_lastName_list = new ArrayList<>();
	
		for(WebElement element : lastName_webelements ) {
			String lastname =  element.getText();
			orginal_lastName_list.add(lastname);
		}
		
		List<String> sortedList = new ArrayList<>(orginal_lastName_list);
		Collections.sort(sortedList);
		
		
		if(orginal_lastName_list.equals(sortedList)) {
			System.out.println("last name values are sorted ");
		} else {
			System.out.println("last name values are not sorted ");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verifyingTable1();
	}

}
