package automationClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationClass_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/elements"); 
		//driver.findElement(By.xpath("//div[@class='header-text'][1]")).click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[2]")).click();
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		Thread.sleep(3000);
		String[] exptecd_Items = {"Desktop", "Documents", "Downloads"};
		//driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		WebElement desktop_checkbox = driver.findElement(By.xpath("//label[@for='tree-node-desktop']/span[1]"));
		desktop_checkbox.click();
		String restult_text = driver.findElement(By.id("result")).getText();
		WebElement result_text2 = driver.findElement(By.id("result"));
		if(restult_text.contains("desktop") || desktop_checkbox.isSelected()) {
			System.out.println("desktop check box is selected");
		}else {
			System.out.println("desktop check box is not selected");
		}
		
		Thread.sleep(5000);		
		desktop_checkbox.click();
		if(!(result_text2.isDisplayed())) {
			System.out.println("desktop check box is un selected");
		}else {
			System.out.println("desktop check box is selected");
		}
		List<WebElement> list1 = driver.findElements(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/label"));
		for(WebElement elemt : list1) {// 1, 2, 3
			String temp = elemt.getText();
			System.out.println("name of the  elements"+ temp);
		}
	for(int i = 0; i<=exptecd_Items.length-1; i++) {
		String act_item_name =  list1.get(i).getText();
		String ext_itemName = exptecd_Items[i];
		if(act_item_name.equals(ext_itemName)) {
			System.out.println(" iteam name matcghed : "+ act_item_name);
		 list1.get(i).click();
		}else {
			System.out.println(" iteam name matcghed : "+ act_item_name);
		}
		
	}
	}

}
