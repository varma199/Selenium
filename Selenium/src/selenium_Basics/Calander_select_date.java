package selenium_Basics;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander_select_date {
	
	public static void select_month(int m) {
		
	
	}
	
	public static void select_date() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String date = "06/15/2025";
		String[] da = date.split("/");
		String month = da[0];
		int month_val = Integer.parseInt(month);
		System.out.println(" month value ---"+month_val);
		String day = da[1];
		int date_value = Integer.parseInt(day);
		String year = da[2];
		
		
		Actions act = new Actions(driver);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		
		WebElement month_year = 	driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));
		wt.until(ExpectedConditions.visibilityOf(month_year));
		//act.click(month_year).click().build().perform();
		month_year.click();
		
		WebElement year_link = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));
		wt.until(ExpectedConditions.visibilityOf(year_link));
		year_link.click();
		
		
		
		
		List<WebElement> month_list = driver.findElements(By.xpath("//div[@class='react-calendar__year-view__months']/button/abbr"));
		//List<String> month_name = new ArrayList<>();
		wt.until(ExpectedConditions.visibilityOfAllElements(month_list));
		
//List<WebElement> month_list = driver.findElements(By.xpath("//div[@class='react-calendar__year-view__months']/button/abbr"));
		
		for(int i = 0; i<=month_list.size()-1; i++) {
			if(i==month_val-1) {
				driver.findElement(By.xpath("//div[@class='react-calendar__year-view__months']/button"+"["+i+"]")).click();
				//String name = driver.findElement(By.xpath("//div[@class='react-calendar__year-view__months']/button"+"["+i+"]"+"/abbr")).getText();
				//System.out.println("month name ----"+name);
				break;
			}
		}
		
		driver.findElement(By.xpath("//abbr[contains(text(),'"+date_value+"')]")).click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		select_date();
		

	}

}
