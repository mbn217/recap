package selenium;

import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRadioButtonMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
        
        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @id='yesRadio']"));
        System.out.println(yesRadioButton.isSelected());
        
        
        driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
        System.out.println(yesRadioButton.isSelected());
        
        

        
//        WebElement impRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @id='impressiveRadio']"));
//        impRadioButton.click();
//        System.out.println(impRadioButton.isEnabled());
//        
//        
//        WebElement noRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @id='noRadio']"));
//        System.out.println(noRadioButton.isEnabled());
        
        
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
        		
        

        
        
        Thread.sleep(5000);
        driver.quit();
	}

}
