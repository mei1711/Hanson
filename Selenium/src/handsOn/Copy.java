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
		    Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		    //System.out.println("drop down click");
		  List<WebElement> dropdown_list =  driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//a"));
		  System.out.println("Total Values size: " + dropdown_list.size());
		  for(int i=0; i<dropdown_list.size();i++) {
			  System.out.println(dropdown_list.get(i).getText());
			   
			  }
		  System.out.println("DropDown values listed");
		  
		  if(dropdown_list.get(1).getText().contentEquals("Radio & Checkbox Demo")) {
			  dropdown_list.get(1).click();
			  System.out.println("Value from drop down selected");
		  }
		  List<WebElement> elementA = driver.findElements(By.name("webform"));
		  System.out.println("Total Number webform is " +elementA.size());
		  for(int i=0;i<elementA.size();i++) {
			  if(elementA.get(i).getAttribute("value").contentEquals("Option 2"));
			  elements.get(i).click();
		  }
		}
		catch (Exception e) {
			System.out.println("My excecution stopped due to:  " +e);
		}
		  }
		}


