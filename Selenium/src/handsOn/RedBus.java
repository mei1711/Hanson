package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Assets\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets");
		driver.findElement(By.xpath("//input[@id='txtSource\']")).sendKeys("Coimabtore");
		}
		catch (Exception e){
			
		}
	}
	
	}
