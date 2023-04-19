package selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

public class Basic_002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();
		System.out.println("-------------------------------------------------Verifying drop down page--------------------------------------------------------");
		if(driver.findElement(By.id("dropdown")).isDisplayed()) {
			System.out.println("system navigated to Drop down page");
			System.out.println("pass");
		}else {
			System.err.println("system not navigated to Drop down page");
			System.err.println("Fail");
		}
		System.out.println("-------------------------------------------------Verifying drop down 1st option--------------------------------------------------------");
		Select slt = new Select(driver.findElement(By.id("dropdown")));
		
		WebElement firstSelectedOption = slt.getFirstSelectedOption();
		String firstOption =  firstSelectedOption.getText();
		System.out.println("first selected option  :  "+firstOption);
		if(firstOption.equalsIgnoreCase("Please select an option")) {
			System.out.println("drop down displaying correct first option");
			System.out.println("pass");
		}else {
			System.err.println("drop down not displaying correct first option");
			System.err.println("Fail");
		}
		System.out.println("-------------------------------------------------Printing all drop down values--------------------------------------------------------");
		List<WebElement> all_options_list = slt.getOptions();
		int num_of_elements = all_options_list.size();
		for(int i = 0; i <num_of_elements;i++) {
			String option = all_options_list.get(i).getText();
			System.out.println(i+"option value   :"+option);
		}
		System.out.println("-------------------------------------------------Verify value present or not in the drop down options--------------------------------------------------------");
		String exp_Value = "option 576";
		
		for(int i = 0; i <num_of_elements;i++) {
			String option = all_options_list.get(i).getText();
			if(option.equals(exp_Value)) {
				System.out.println("Expected value is present in the drop down options"+ option);
				System.out.println("Pass");
			}else {
				System.err.println("Expected value is not present in the drop down option");
				System.err.println("Fail");
			}
		}
		System.out.println("-------------------------------------------------Verifying selecting the option form drop down--------------------------------------------------------");
		slt.selectByValue("2");
		WebElement selected_option1 = slt.getFirstSelectedOption();
		String value = selected_option1.getText();		
		
				if(value.equals("Option 2")) {
					System.out.println("value"+value+"selected for drop down");
					System.out.println("Pass");
				}else {
					System.err.println("value is not selected for dropdown");
					System.err.println("fail");
				}
		System.out.println("-------------------------------------------------Verifying unselecting the option form drop down--------------------------------------------------------");
		slt.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		WebElement selected_option2 = slt.getFirstSelectedOption();
		String value2 = selected_option2.getText();		
		
				if(value2.equals("Option 1")) {
					System.out.println("value"+value2+"selected for drop down");
					System.out.println("Pass");
				}else {
					System.err.println("value is not selected for dropdown");
					System.err.println("fail");
				}
	

		
		System.out.println("-------------------------------------------------closeing the browser--------------------------------------------------------");
		driver.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
