package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumBrokenLinksMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        
        String myFirstTab = driver.getWindowHandle(); //toolsQA Tab
        ArrayList<String> myOtherTabs = new ArrayList<>(driver.getWindowHandles());//all other tabs
        driver.switchTo().window(myOtherTabs.get(1));//second tab
        
        
        
        boolean isDisplayed = driver.findElement(By.xpath("//h1[contains(.,'This is a sample page')]")).isDisplayed();

        System.out.println(isDisplayed);
        
        driver.switchTo().window(myOtherTabs.get(0));
        
        driver.findElement(By.id("windowButton")).click();
        
        
        
        Thread.sleep(5000);
        driver.quit();
	}

}
