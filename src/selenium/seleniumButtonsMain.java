package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumButtonsMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        //double click
        WebElement myTargetDoubleClickButton=  driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        Actions action = new Actions(driver);
        action.doubleClick(myTargetDoubleClickButton).perform();
        
        //rightclick   
        Thread.sleep(1000);
        WebElement rightClickButtonTarget = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        action.contextClick(rightClickButtonTarget).perform();
        
        
        //click button  
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[starts-with(.,'Click Me')]")).click();

        
        
        Thread.sleep(5000);
        driver.quit();
	}

}
