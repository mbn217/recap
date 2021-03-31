package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        //click on + button
        driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Notes')]")).click();



        
        Thread.sleep(5000);
        driver.quit();
	}

}
