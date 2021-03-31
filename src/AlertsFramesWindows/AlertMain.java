package AlertsFramesWindows;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        
        
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        //driver.switchTo().alert().sendKeys("HI");
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hi");
        
       
        

        Thread.sleep(5000);
        driver.quit();
	}

}
