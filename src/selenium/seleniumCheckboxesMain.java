package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCheckboxesMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");


        WebElement textBox = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        textBox.click();
        
        driver.findElement(By.cssSelector("#userName")).sendKeys("MOhamed");//css selector
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("this is what iim putting "
        		+ "in the paragrapgh");
        
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("kbsdkxbgxhbghgbs");
        driver.findElement(By.xpath("//button[@id='submit']")).click();//click on submit button
        
        
        
        
        Thread.sleep(5000);
        driver.quit();
	}

}
