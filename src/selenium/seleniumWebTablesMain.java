package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumWebTablesMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // System Property for Chrome Driver  , telling selenium what browser type of driver we will ve using 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed.Nheri\\eclipse-workspace\\Recap\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); //driver have a reference in the memory == not null
		

        
        //navigate to a url
        driver.manage().window().maximize();
        driver.get("https://semantic-ui.com/collections/table.html");
//
//        List<WebElement> listOfSecondRowElement = driver.findElements(By.xpath("(//table[@class='ui celled table'])[1]/tbody/tr[1]/td"));
//        
//        System.out.println(listOfSecondRowElement.size());
//        for (int i = 0; i < listOfSecondRowElement.size(); i++) {
//        System.out.println(listOfSecondRowElement.get(i).getText());		
//        }
        //find element for entire table
        WebElement myTable = driver.findElement(By.xpath("(//table[@class='ui celled table'])[1]"));
        List<WebElement> tableRows = myTable.findElements(By.tagName("tr"));//tableRows have 4 rows elements 

        
        //System.out.println(tableRows.size());
        
        //loops through each table row 
        for(WebElement rowElem : tableRows) {
        	
        	
        	List<WebElement> tableCol = rowElem.findElements(By.tagName("td"));//3 tds for each row
        	
        	for(WebElement colElem : tableCol) {
        		System.out.println(colElem.getText());
        	}
        	
        	
        	
        }
        System.out.println("=======================================");
        
        for(WebElement rowElem : tableRows) {
        	
        	
        	List<WebElement> tableColHeader = rowElem.findElements(By.tagName("th"));//3 tds for each row
        	
        	for(WebElement colElem : tableColHeader) {
        		System.out.println(colElem.getText());
        	}
        	
        	
        	
        }
        
        
        
        
        
        
        

        Thread.sleep(5000);
        driver.quit();
	}

}
