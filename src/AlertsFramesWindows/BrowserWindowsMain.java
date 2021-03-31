package AlertsFramesWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowsMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");
        driver.findElement(By.xpath("//a[contains(text(),'Click Here for Broken Link')]")).click();
        
        if (driver.findElement(By.xpath("//p[contains(.,'500')]")).isDisplayed()==true) {
			System.out.println("Page is broken");
		}else {
			System.out.println("Page loaded fine");
		}



        
        
        

        Thread.sleep(5000);
        driver.quit();
	}

}
