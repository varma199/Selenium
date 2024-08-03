package selenum_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> search_list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		int size = search_list.size();
		int count =0;
		for(int i = 0;i<=size; i++)
		{

		String temp = search_list.get(i).getText();
		if(temp.contains("selenium"))
				{
			System.out.println("Search results have selenium key word");
		}else{
			System.out.println("Search results does not have selenium key word");
			count ++;
		}


		}

		if(count>=1){
			System.out.println("Search results does not have selenium key word");
			System.out.println("num of key worde dose not have selenium keyword is :" +count);
			
		}


	}

}
