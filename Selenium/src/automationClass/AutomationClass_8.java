package automationClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class AutomationClass_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		
		WebElement btn_createNew_account = driver.findElement(By.xpath("//*[contains(text(), 'Create new account')]"));
		btn_createNew_account.click();
		
		//driver.findElement(By.xpath("")).click();
		
		Thread.sleep(3000);
		/*
		 * dropdowns----> Select
		 * 
		 */
		WebElement date = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select select_date = new Select(date);
		select_date.selectByValue("1");
		WebElement selected_webelement =  select_date.getFirstSelectedOption();
		System.out.println("Selected Web element ---->"+selected_webelement);
		String selected_value =  selected_webelement.getText();
		System.out.println("selected value --->"+ selected_value);
		
		Select select_month = new Select(month);
	select_month.selectByValue("12");
	WebElement selected_month = select_month.getFirstSelectedOption();
	String selected_month_value =  selected_month.getText();
	System.out.println("selected_month_value---->"+selected_month_value);
	
	
	Select select_year = new Select(year);
	select_year.selectByVisibleText("2020");
	String year_value = select_year.getFirstSelectedOption().getText();
	System.out.println("Selected year value  ---->"+year_value);
	
	List<WebElement> month_list = select_month.getOptions();
//	System.out.println(month_list);
	int list_size = 	month_list.size();
	System.out.println("num of stored web elements --->"+ list_size);
	for(int i =0; i<=list_size-1; i++) {
		String temp =  month_list.get(i).getText();
		System.out.println(" name of the month---->"+ temp);
		if(temp.equals("Jun")) {
			System.out.println("month available");
		}else {
			System.err.println("Month not available");
		}
	}
	
	
	
	
	
	
	
	
	//driver.close();
		
		
		/*Select select_date = new Select(date);
		select_date.selectByValue("1");
		WebElement one =  select_date.getFirstSelectedOption();
	String selected_option = one.getText();
	System.out.println(selected_option);
		
		
		Select select_month = new Select(month);
		select_month.selectByValue("1");
		
		Select select_year = new Select(year);
		select_year.selectByVisibleText("2024");*/
		
		
		
		
	
		

	}

}
