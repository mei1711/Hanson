package handsOn;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Copy {
	public static void main(String[] args) {
		try {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Assets\\Chrome driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://demo.guru99.com/test/ajax.html");
		    List<WebElement> elements = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		    	if(elements.get(i).getAttribute("value").contentEquals("Yes")){
		    		System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		    		elements.get(i).click();
		    	}
		      
		    }
		  driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		    //System.out.println("drop down click");
		    WebElement dropdown = driver.findElement(By.xpath("//a[@class='dropdown-toggle']")); 
	        Select select = new Select(dropdown); 
	       List<WebElement> options = select.getOptions(); 
	        for(WebElement item:options) 
	        { 
	        
	             System.out.println("Dropdown values are "+ item.getText());          
	           }
		    
		}
		catch (Exception e) {
			System.out.println("My excecution stopped due to:  " +e);
		}
		  }
		}


