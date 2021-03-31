package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumLinksMain {

	public static void main(String[] args) throws InterruptedException {
		String expectedAfterCreatedLinkClicked = "Link";
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");

        //clicked n simple link
        //driver.findElement(By.id("simpleLink")).click();
        
        
        //clciked on created link
        driver.findElement(By.xpath("//a[@id='created']")).click();
        Thread.sleep(1000);
        //verify that the dynammic txt is displayed at the bottom
        String actualLabelAfterCreatedLinkISClicked = driver.findElement(By.xpath("//p[10]")).getText();

        if (expectedAfterCreatedLinkClicked.equals(actualLabelAfterCreatedLinkISClicked)) {
			System.out.println("The statment matched successfully");
		}else {
			System.out.println("oops somthing is wrong expected is:"+ expectedAfterCreatedLinkClicked +" but found in the UI this: "+
					actualLabelAfterCreatedLinkISClicked);
		}
        
        
        
        Thread.sleep(5000);
        driver.quit();
	}

}
