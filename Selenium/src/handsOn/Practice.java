package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice implements WebElements {

	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Assets\\Chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(WebElements.strUrlA);
			System.out.println("URL Access - PASS");
			driver.findElement(By.xpath(WebElements.strBingSearch)).sendKeys("lion");
			System.out.println("Search Entry - PASS");
			//driver.findElement(By.xpath(strImage)).click();
			driver.findElement(By.cssSelector(cssSelector)
			System.out.println("Click Image - PASS");

			// driver.findElement(By.xpath(strTextbox)).sendKeys("simple website for
			// Selenium practice");
		}

		catch (Exception e) {

			System.out.println("The applicaion is facing the error: " + e);
		}

	}

}
