package automationClass;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationClass_6 {
	/*
	 * Window Handel
	 *switchTo().window()
	 *windowHandle()
	 *windowHandles()
	 *
	 *set()
	 *Array
	 *for each
	 *if
	 */

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		// Get the window handles (IDs of all open windows/tabs)
        Set<String> windowHandles = driver.getWindowHandles(); // it will get the all tabs / browsers ids and we are storing in set 

        // Convert the Set to an array to access individual window handles
        String[] handles = windowHandles.toArray(new String[0]);
        
        
        
        // Switch to the new tab (the second handle in the array)
        driver.switchTo().window(handles[1]);
        Thread.sleep(5000);
        
        System.out.println("widow handel id :  "+ handles[0]);
        System.out.println("widow handel id :  "+ handles[1]);
        
        String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println("Text in new window --->"+text);
        
        driver.close();
        driver.switchTo().window(handles[0]);
        Thread.sleep(5000);
        
                Thread.sleep(6000);

        
        
        
        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='example']/a")).click();
        
        String mainWindowHandle = driver.getWindowHandle();  // it will get current window  id 11111111111
        
        Set<String> allWindowHandles = driver.getWindowHandles(); // it will get all open windows ids 1111111, 2222222 
        
        for(String windowHandle : allWindowHandles) { //2222222
        	if(!windowHandle.equals(mainWindowHandle)) { //2222222 != 11111111111 
        		driver.switchTo().window(windowHandle); // 2222222
        		break;
        		
        	}
        }
        Thread.sleep(5000);
        String newWindow_text = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        System.out.println("new window text ----> "+newWindow_text );
        
        driver.quit();
        
        
        
        
        
        /*
                
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        WebElement window_button = driver.findElement(By.xpath("//button[@id='windowButton']"));
        
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", window_button);
        
        Actions act = new Actions(driver);
        act.click(window_button).build().perform();
        
        Set<String> windowHandles2 = driver.getWindowHandles();

        // Convert the Set to an array to access individual window handles
        String[] handles2 = windowHandles2.toArray(new String[0]);

        // Switch to the new tab (the second handle in the array)
        driver.switchTo().window(handles2[1]);
        Thread.sleep(5000);
        
        String text2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println("Text in new window --->"+text2);
        
        driver.close();

        
        
        
        WebElement new_window_message_button = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
       
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", new_window_message_button);
        
        act.click(new_window_message_button).build().perform();
        
        Set<String> windowHandles3 = driver.getWindowHandles();

        // Convert the Set to an array to access individual window handles
        String[] handles3 = windowHandles3.toArray(new String[0]);

        // Switch to the new tab (the second handle in the array)
        driver.switchTo().window(handles3[1]);
        Thread.sleep(5000);
        String text3 = driver.findElement(By.partialLinkText("Knowledge increases")).getText();
        
        System.out.println("test in 3rd window--->"+text3);
        driver.close();*/
        

        
        
	}

}
